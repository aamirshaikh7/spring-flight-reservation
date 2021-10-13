console.log('index');

$(document).ready(function () {
	var customerPath = "http://localhost:1111/customer";
	
	$('#register').click(function () {
		var title = $('#title').val();
		var firstName = $('#first-name').val();
		var surname = $('#surname').val();
		var dob = $('#dob').val();
		var mobile = $('#mobile').val();
		var email = $('#email').val();

		$.ajax({
			type : 'POST',
			url : customerPath + "/save",
			contentType : "application/json; charset=utf-8",
			data : JSON.stringify({ "title" : title, "firstName" : firstName, "surname" : surname, "dob" : dob, "mobile" : mobile, "email" : email }),
			cache : false,
			success : function (result) {
				console.log('insert success');
			},
			error : function (error) {
				console.log('insert failed');
			}
			
		});
		
	});
	
});