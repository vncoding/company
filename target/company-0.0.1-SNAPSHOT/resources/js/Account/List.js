var oTable;
var selected_id;
$(document).ready(function() {
	oTable = $('#accountable').dataTable({
		"sDom": 'l<"toolbar">frtip',
		"bFilter" : false,
		"bStateSave" : false,
		"aaSorting" : [ [ 1, "asc" ] ],
		"sPaginationType" : "bootstrap",
		"oLanguage" : {
			"sLengthMenu" : "Display _MENU_ records per page",
			"sZeroRecords" : "Nothing found - sorry",
			"sInfo" : "Showing _START_ to _END_ of _TOTAL_ records",
			"sInfoEmpty" : "Showing 0 to 0 of 0 records"
		},
		"bProcessing" : true,
		"bServerSide" : true,
		"sAjaxSource" : "/company/account/list",
		"aoColumns" : [ {"mData" : "accountId" },
		                {"mData" : "userName"},
		                {"mData" : "phone"},
		                {"mData" : "email"},
		                {"mData" : "address"},
		                {"mData" : "role"}
		               ],
		"aoColumnDefs": [
		                 { "sName": "accountId",   "aTargets": [ 0 ] },
		                 { "sName": "userName",  "aTargets": [ 1 ] },
		                 { "sName": "phone", "aTargets": [ 2 ] },
		                 { "sName": "email",  "aTargets": [ 3 ] },
		                 { "sName": "address",    "aTargets": [ 4 ] },
		                 { "sName": "role",    "aTargets": [ 5 ] },
		                 { "sClass" : "hide",   "aTargets" : [ 0 ]}
		               ],
	  "fnDrawCallback": function ( oSettings ) {
		                   $('#accountable tbody tr').each( function () {
		                	   selected_id = null;
		                       $(this).click( function () {
		                    	   oTable.$('tr.row_selected').removeClass('row_selected');
		                           $(this).addClass('row_selected');
		                           selected_id =  $(this).children(":first").html();
		                       });
		                       $(this).hover( function () {
		                    	   $(this).addClass( 'row_highlighted' )
		                       }, function(){
		                    	   $(this).removeClass('row_highlighted');
		                       });
		                   });
		               }
	});
	initCrudButtons();
});

/**
 * Initializing crud buttons
 */
function initCrudButtons(){
	$("div.toolbar").html('<a href="/company/account/create" id="bt_add" class="btn btn-primary">Create</a> <a href="#" id="bt_update" class="btn btn-success">Edit</a> <button id="bt_delete" type="button" class="btn btn-danger">Delete</button>');

	$("#bt_update").click(function() {
		if (selected_id == null) {
	    	  $('#errorModalLabel').html('Warning:');
	    	  $('#errorModalMsg').html('Please select a record first.');
	    	  $('#errorModelBody').attr('class', 'modal-body alert alert-warning');
	    	  $('#errorModal').modal();
		} else {
			$("#bt_update").attr("href", "/company/account/update/" + selected_id);
		}
	});

	$("#bt_delete").click(function() {
		if (selected_id == null) {
	    	  $('#errorModalLabel').html('Warning:');
	    	  $('#errorModalMsg').html('Please select a record first.');
	    	  $('#errorModelBody').attr('class', 'modal-body alert alert-warning');
	    	  $('#errorModal').modal();
		} else {
			deleteAccount(selected_id);
		}
	});

}

/**
 * Delete button handler
 * @param type
 * @param id
 */
function deleteAccount(id){
	$.ajax({
        type: "DELETE",
        url: '/company/account/'+id,
        success: function(response,status,xhr){
            	oTable.$('tr.row_selected').remove();
            	selected_id = null;
        },
	    error: function (xhr, ajaxOptions, thrownError) {
	  	  $('#errorModalLabel').html("Error Server "+xhr.status+":");
	  	  $('#errorModalMsg').html(xhr.responseText);
	  	  $('#errorModelBody').attr('class', 'modal-body error alert-error');
	  	  $('#errorModal').modal();
	    }
   });
}




