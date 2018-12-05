$(function() {
        $( "#dob" ).datepicker({
            dateFormat : 'mm/dd/yy',
            changeMonth : true,
            changeYear : true,
            yearRange: '-100y:c+nn',
            maxDate: '-1d'
        });
    });

var basket = [];

var thing = function(name, price, qty){
	this.name = name;
	this.price = price;
	this.qty = qty;
};

function addToBasket(name, price, qty){
	var item = new thing(name, price, qty);
	basket.push(item);
}

addToBasket("beats", 34.99, 1);
addToBasket("sony", 35.99, 3);

console.log(basket);

function removeFromBasket(name){
	for(var i=0;i<basket.length;i++){
		if(basket[i].name === name){
			basket[i].qty--;
			if(basket[i].qty === 0){
				basket.splice(i,1);
			}
			break;
		}
	}

}



function clearBasket(){
		basket = [];
}

clearBasket();

function basketQuantity(){
	var count = 0;
	for(var i=0;i<basket.length;i++){
		count += basket[i].qty;

	}
	return count;
}


function basketTotal(){

	var total = 0;
	for(var i=0;i<basket.length;i++){
		total += basket[i].price;
	}
	return total;
}

