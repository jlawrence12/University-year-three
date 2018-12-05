//function to display error messages within the form
function alerts(location, type, message, closable) {
    if (closable == true) 
        $('#'+location +'Alert').html('<div class="alert alert-'+type+' alert-dismissible fade in '+location+'" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +message+'</div>');
    else
        $('#'+location+'Alert').html('<div class="alert alert-'+type+' fade in '+location+'" role="alert">'+message+'</div>');
}

function adminLogin(){

	clearErrors();

	//Collect info from forms
	var email = $('#adminEmail').val().toLowerCase();
    var password = $('#adminPassword').val();

    //convert into ajax data
	var data = { adminEmail: email, adminPassword: password };

	$.ajax(
	{ 
		dataType: 'json',
		type: 'POST',
		url: 'admin.php',
		data: data,
		success: function(ajaxResponse) {
			switch(ajaxResponse.result) {
				case "successfulLogin": 
				console.log(ajaxResponse.result);
					window.location.replace("products.php"); 
					break;
				case "incorrectCredentials": 
				console.log(ajaxResponse.result);
					alerts("login", "danger", "Incorrect credentials. Please try again", false); 
					$('.form-group:has(input[name*="Login"])').addClass('has-error');
					break;
			}
		},
	});
	return false;
}

//Show the modal when button is clicked 
function showEditProduct(barcode) {
	$("#barcode").prop('disabled', true); 
	$('#viewProduct-' + barcode).modal('show'); 
}

function saveEditProduct(form, oldBarcode) {
	clearErrors();

	//collect value from forms
	var barcode = $(form).find('[name="barcode"]').val();
	var brand = $(form).find('[name="brand"]').val();
	var model = $(form).find('[name="model"]').val();
	var colour = $(form).find('[name="colour"]').val();
	var price = $(form).find('[name="price"]').val();
	var stock = $(form).find('[name="stock"]').val();
	var video = $(form).find('[name="video"]').val();


	//convert the data into ajax 
	var editData = {
		barcode: oldBarcode,
		newBarcode: barcode,
		brand: brand,
		model: model,
		colour: colour,
		price: price,
		stock: stock,
		video : video,
	};

		//enter ajax
		$.ajax(
		{ 
		dataType: 'json',
		type: 'POST',
		url: 'editProduct.php',
		data: editData,
		success: function(ajaxResponse) {
			switch(ajaxResponse.result) {
				case "success":
					$('#viewProduct-' + oldBarcode).modal('hide');
					location.reload();
					break;
			}
		},
	});
	return false;
}


function clearErrors() {
	$(".form-group.has-error").removeClass('has-error');
	$("label.error-msg, .alert").remove();

}

//Show the modal when button is clicked
function showDeleteProduct(barcode) {
	$("#yes").attr("onclick", "return deleteProduct("+ barcode +");");
	$('#deleteProduct').modal('show'); 

}

function deleteProduct(barcode) {
	$.ajax(
	{ 
 		dataType: 'json',
 		type: 'POST',
 		url: 'deleteProduct.php',
 		data: {barcode: barcode},
 		success: function(ajaxResponse) {
 			if (ajaxResponse.result == "error") {
 				alert(" An error has occured");
 				return;
 			} else if (ajaxResponse.result == "success")
 				$('#deleteProduct').modal('hide');
 				location.reload(); 
 		}
 	});
}



