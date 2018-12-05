var Cart = {

    data: [],
    id: 0,

    // Responsible for keeping the total price updated.
    updateTotals: function() {
        Cart.data = JSON.parse(localStorage.getItem('cartData')) || [];
        
        var units = document.getElementById("units");
        units.innerHTML = Cart.data.length;

        var totalPrice = 0;
        for(var i = 0; i < Cart.data.length; i++) {
            totalPrice += Cart.data[i].price;
        }

        var totalEl = document.getElementById("total");
        totalEl.innerHTML = '£' + totalPrice.toFixed(2);
    },

    // Save data using HTML5 Local Storage.
    saveData: function() {
        var dataToString = JSON.stringify(Cart.data);
        localStorage.setItem('cartData', dataToString);
        Cart.updateTotals();
    },

    // Add item to array, save it to Local Storage 'cartData' and then add a list item to the shopping cart.
    add: function() {
        
        var item = {
            uid: Cart.id++,
            name: 'Lorem Ipsum',
            price: 12.99
        }
        Cart.data.push(item);
        Cart.saveData();
        Cart.renderModalList(item.uid);
    },

    // After looping through the Cart array, if argument is equal to the arrays unique ID then remove from 
    // the array, save Local Storage data, then remove shopping cart list item.  
    remove: function(n) {
        for(var i = 0; i < this.data.length; i++) {
            if(n === this.data[i].uid){
                Cart.data.splice(i, 1);
                Cart.saveData();
                var li = document.getElementById("remove" + n);
                document.getElementById("cartList").removeChild(li);
            }
        }
    },

    // When called render a list item with a unique ID based on the argument and attach event.
    renderModalList: function(id) {
        var node = document.createElement("li");
        node.id = "remove" + id;
        node.innerHTML = 'Remove item ' + id;
        document.getElementById("cartList").appendChild(node);
        Cart.events(id);
    },

    // Function takes argument when renderModalList called. When element is clicked, remove this list item
    // from shopping cart, and update array, Local Storage data and total price and item tally.
    events: function(el) {
        var removeTrigger = document.getElementById("remove" + el);
        removeTrigger.addEventListener("click", function(e){ 
            e.preventDefault();
            Cart.remove(el);
        }, false);
    },

    // First see if prices need to tallied up based on Local Storage. If Local Storage data array is not
    // empty then re-populate the shopping cart list based on each items unique ID. When the add button is clicked
    // add a new item to the shopping list.
    init: function() {

        Cart.updateTotals();
        
        if(Cart.data.length != []) {
            for(var i = 0; i < Cart.data.length; i++){
                var n = Cart.data[i];
                Cart.renderModalList(n.uid);
                Cart.id = n.uid + 1;
            }
        }
        
        var addBtn = document.getElementById("add");
        addBtn.addEventListener("click", function(e) { 
            e.preventDefault(); 
            Cart.add();
        });
    
    }
}

// Run the Cart
Cart.init();


// Hide or show the Modal
var modal = document.getElementsByClassName("modal")[0];

var bubble = document.getElementById("units");
bubble.addEventListener("click", function(e){
    modal.className = "modal show";
});

var modalClose = document.getElementById("close");
modalClose.addEventListener("click", function(e){ 
    modal.className = "modal";
});