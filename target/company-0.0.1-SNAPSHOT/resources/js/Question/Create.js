$(document).ready(function() {
	var validator = $("#accountForm").validate({
		rules: {
			userName: "required",
			phone: "required",
			address: "required",
			role: "required",
			password: {
				required: true,
				minlength: 5,
				maxlength:10
			},
			password_confirm: {
				required: true,
				minlength: 5,
				maxlength: 10,
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			}
		},
		messages: {
			userName: {required : "Enter your username"},
			phone:  {required  : "Enter your phone"},
			password:  {
				required: "Provide a password",
				minlength: jQuery.format("Enter at least {0} characters"),
				maxlength: jQuery.format("Enter a maximum of {0} characters")
			},
			password_confirm: {
				required: "Repeat your password",
				equalTo: "Enter the same password as above"
			},
			email: {
				required: "Please enter a valid email address",
				minlength: "Please enter a valid email address"
			},
			address: {required : "Enter your address"},
			role: {required : "Enter your role"}
		},
		errorPlacement: function(error, element) {
			error.appendTo(element.next());
		},
		submitHandler: function() {
			var jsonData = {
				userName : $("input#userName").val(),
				phone : $("input#phone").val(),
				password : $("input#password").val(),
				email : $("input#email").val(),
				address : $("input#address").val(),
				role : $("input[name=role]:checked").val()
			};
			$.ajax({
				  type: "POST",
				  url: "/company/question/createSave/",
				  data: JSON.stringify(jsonData),
				  contentType: "application/json; charset=utf-8",
				  success: function(response,status,xhr) {
					  document.location.href='/question/account/';
				  }
				});
			return false;
		},
		success: function(label) {
		}
	});
	cancelButtonHandler();
});

/**
 * Cancel button handler
 */
function cancelButtonHandler(){
	$("#cancelButton").click(function() {
		document.location.href='/company/question/';
	});
}

