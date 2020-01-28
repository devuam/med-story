<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<h3>
	Pacientes del doctor <span class="generalHeader"><c:out
			value="${medStoryName}" /></span>
</h3>

<div class="patientsContainer">
	<div id="patientsSideNavbar" class="sidenavbar">
		<a href="javascript:void(0)" class="closebtn" id="sideNavbarCloser"><i class="fa fa-arrow-left"></i></a>
		
		<div align="center">
			<p>Datos del paciente</p>
			
			<form id="createForm">
				<div class="form-group patientInput">
					<input type="text" id="name" name="name" class="form-control" placeholder="Nombre(s)" autofocus maxlength="50">
				</div>
				
				<div class="form-group patientInput">
					<input type="text" id="fatherName" name="fatherName" class="form-control" placeholder="Apellido paterno" autofocus maxlength="50">
				</div>
				
				<div class="form-group patientInput">
					<input type="text" id="motherName" name="motherName" class="form-control" placeholder="Apellido materno" autofocus maxlength="50">
				</div>
				
				<div class="form-group patientInput">
					<input type="text" id="birthday" name="birthday" class="form-control" placeholder="Fecha de nacimiento" autofocus maxlength="50">
				</div>
				
				<div class="patientInput">
					<button id="btnCreate" class="btn btn-sm btn-primary btn-block" type="submit">Crear <i class="fa fa-cog fa-spin fa-lg fa-fw createSpinner"></i></button>
				</div>
			</form>
		</div>
	</div>
	
	<div id="patientsContent">
		<div class="row">
			<div class="col-md-12">
				<span id="sideNavbarOpener" class="patientNew"><i class="fa fa-user-circle"></i> Nuevo</span>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12 patientsTableContainer">
				<table id="patientsTable" class="table table-striped table-bordered table-sm patientsTable">
					<thead>
					    <tr>
					    	<th class="th-sm">Id</th>
					      	<th class="th-sm">Nombre(s)</th>
					      	<th class="th-sm">Apellido paterno</th>
					      	<th class="th-sm">Apellido materno</th>
					      	<th class="th-sm">Fecha de nacimiento</th>
					      	<th class="th-sm">Acciones</th>
					    </tr>
					</thead>
				  	<tbody class="patientsBodyTableContainer">
				  	</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="confirm" role="dialog" style="margin-top: 75px;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-body">
				<p id="modalDeleteTitle"></p>
			</div>
			<div class="modal-footer">
			    <button type="button" data-dismiss="modal" class="btn btn-danger" id="modalDelete" name="" onclick="deletePatient(this.name);">Eliminar <i class="fa fa-cog fa-spin fa-lg fa-fw deleteSpinner"></i></button>
			    <button type="button" data-dismiss="modal" class="btn">Cancelar</button>
		  	</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		$( "#sideNavbarOpener" ).click(function() {
			$('#patientsSideNavbar').css('width', '250px');
			$('#patientsContent').css('margin-left', '250px');
		});
		
		$( "#sideNavbarCloser" ).click(function() {
			$('#patientsSideNavbar').css('width', '0');
			$('#patientsContent').css('margin-left', '0');
		});
		
		$( "#birthday" ).datepicker({
			changeMonth: true,
            changeYear: true,
			dateFormat: "yy-mm-dd",
			monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
			monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
			dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
		    dayNamesShort: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sa'],
		    dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sa'],
		    showAnim: "slideDown",
		    yearRange: 'c-100:c'
		});
		
		$("#createForm").validate(
				{
					rules: {
						name: {
							required: true
						},
						fatherName: {
							required: true
						},
						motherName: {
							required: true
						},
						birthday: {
							required: true
						}
					},
					highlight: function(element){
						$(element).closest(".form-group").removeClass("has-success").addClass("has-error");
					},
					unhighlight: function(element){
						$(element).closest(".form-group").removeClass("has-error").addClass("has-success");
					},
					messages: {
						name: "El (Los) nombre(s) es (son) requerido(s)",
						fatherName: "El apellido paterno es requerido",
						motherName: "El apellido materno es requerido",
						birthday: "La fecha de nacimiento es requerida"
					},
					submitHandler: function(form) {
						var data = {
								"name": $('#name').val(),
								"fatherName": $('#fatherName').val(),
								"motherName": $('#motherName').val(),
								"birthday": $('#birthday').val()
					    }
						
						$.ajax({
				            url: "<spring:url value='/patients.html' />",
				            type: 'POST',
				            data: JSON.stringify(data),
				            contentType : 'application/json; charset=utf-8',
				            beforeSend: function(){
				            	$('#btnCreate').prop("disabled", true);
								$('.createSpinner').css('visibility', 'visible');
				            },
				            success: function(response) {
				            	if(response == "0"){
				            		cleanCreateObjects();
				            		enableCreateObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify('Paciente creado exitosamente', 'customSuccess', 5);
									
									loadPatients();
				            	}else{
				            		enableCreateObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify(response, 'customError', 5);
				            	}
				            },
				            error: function(e){
				            	cleanCreateObjects();
				            	enableCreateObjects();
			            		
			            		alertify.set('notifier','position', 'top-right');
								alertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);
				            },
				            timeout: 10000
				        });
				    }
				}
		);
		
		function cleanCreateObjects() {
			$('#name').val('');
			$('#fatherName').val('');
			$('#motherName').val('');
			$('#birthday').val('');
		}
		
		function enableCreateObjects() {
			$('#btnCreate').prop("disabled", false);
			$('.createSpinner').css('visibility', 'hidden');
		}
		
		loadPatients();  
	});
	
	function loadPatients(){
  		$.ajax({
	  		url: "<spring:url value='/patients/search.html' />",
	        method: "GET",
	        success: function (data) {
	        	$('#patientsTable').DataTable().destroy();
	        	$(".patientsBodyTableContainer").empty();
	        	var obj = jQuery.parseJSON(data);
	        	
	        	$.each(obj, function(index, value) {
	        		var date = new Date(value.birthday);
	        		var months = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"];
	        		
        			$(".patientsBodyTableContainer").append("<tr><td class='text-center'><strong>" + value.id + "</strong></td><td>" + value.name + "</td><td>" + value.fatherName + "</td><td>" + value.motherName + "</td><td>" + date.getFullYear() + "-" + months[date.getMonth()] + "-" + date.getDate() + "</td><td class='text-center'><button type='button' class='btn btn-info patientsActionsButton patientsActionsButtonUpdate' data-toggle='tooltip' data-placement='bottom' title='Editar' id='" + value.id + "'><i class='fa fa-pencil'></i></button><button type='button' class='btn btn-danger patientsActionsButton patientsActionsButtonDelete' data-toggle='tooltip' data-placement='bottom' title='Eliminar' id='" + value.id + "' name='" + value.name + " " + value.fatherName + " " + value.motherName + "'><i class='fa fa-trash'></i></button></td></tr>");
        		});
	        	
	        	$('#patientsTable').DataTable({
	    			"ordering": true,
	    			"language": {
	    	            "lengthMenu": "Mostrar _MENU_ registros por página",
	    	            "zeroRecords": "No se encontraron registros, lo sentimos",
	    	            "info": "Se mustra la página _PAGE_ de _PAGES_",
	    	            "infoEmpty": "No hay registros disponibles",
	    	            "infoFiltered": "(información filtrada de un total de _MAX_ registros)",
	    	            "search": "Buscar:",
	    	            "emptyTable": "La tabla no tiene pacientes para mostrar",
	    	            "paginate": {
	    	                "first": "Primero",
	    	                "last": "Último",
	    	                "next": "Siguiente",
	    	                "previous": "Previo"
	    	            },
	    	            "processing":     "Procesando...",
	    	        }
	    		});
	    		
	    	  	$('.dataTables_length').addClass('bs-select');
	    	  	
	    	  	$('[data-toggle="tooltip"]').tooltip();
	    	  	
	    	  	$(".patientsActionsButtonDelete").click(function(){
	    	  		$('#modalDeleteTitle').text('¿Seguro que deseas eliminar al paciente ' + $(this).attr('name') + '?');
	    	  		$('#modalDelete').attr('name', $(this).attr('id'));
	    	  		$('#confirm').modal('show');
	    	  	});
	    	  	
	    	  	$(".patientsActionsButtonUpdate").click(function(){
	    	  		var id = $(this).attr('id');
	    	  		var partial = "<spring:url value='/patients-details.html?id=id:value' />";
	    	  		var url = partial.replace("id:value", id);
	    	  		
	    	  		window.location.href = url;
	    	  	});
	        }
	    });
  	}
	
	function deletePatient(id){
		var data = {
				"id": id,
	    }
		
		$.ajax({
            url: "<spring:url value='/patients/delete.html' />",
            type: 'POST',
            data: JSON.stringify(data),
            contentType : 'application/json; charset=utf-8',
            beforeSend: function(){
            	$('#modalDelete').prop("disabled", true);
				$('.deleteSpinner').css('visibility', 'visible');
            },
            success: function(response) {
            	if(response == "0"){
            		enableDeleteObjects();
            		
            		alertify.set('notifier','position', 'top-right');
					alertify.notify('Paciente eliminado exitosamente', 'customSuccess', 5);
					
					loadPatients();
            	}else{
            		enableDeleteObjects();
            		
            		alertify.set('notifier','position', 'top-right');
					alertify.notify(response, 'customError', 5);
            	}
            },
            error: function(e){
            	enableDeleteObjects();
        		
        		alertify.set('notifier','position', 'top-right');
				alertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);
            },
            timeout: 10000
        });
	}
	
	function enableDeleteObjects() {
		$('#modalDelete').prop("disabled", false);
		$('.deleteSpinner').css('visibility', 'hidden');
		$('#confirm').modal('hide');
	}
</script>