<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div align="center">
	<img src='<c:url value="/resources/images/logoMedstory.png"/>' alt="logo" class="indexImageHeader">
	
	<div class="indexUserContainer">
		<div class="row indexUserLogin">
			<div class="col-md-3"></div>
			<div class="col-md-6 indexUserActions">
				<h4>Ingresa con tu cuenta</h4>
				
				<form class="form-signin" action='<spring:url value="/j_spring_security_check" />' method="POST">
					<div class="form-group">
						<input type="text" name="j_username" class="form-control" placeholder="Email" autofocus maxlength="50">
					</div>
					
					<div class="form-group">
						<input type="password" name="j_password" class="form-control" placeholder="Contraseña" autofocus maxlength="50">
					</div>
					
					<div align="center">
						<button id="btnLogin" class="btn btn-sm btn-info btn-block" type="submit">Ingresar <i class="fa fa-cog fa-spin fa-lg fa-fw loginSpinner"></i></button>
					</div>
				</form>
				
				<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
					<script>
						alertify.set('notifier','position', 'top-right');
						alertify.notify("${SPRING_SECURITY_LAST_EXCEPTION.message}", 'customError', 5);
					</script>
				</c:if>
				
				<hr>
				
				<div class="row" align="center">
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="loginCreateAccountToggler" class="btn btn-link indexUserLink">Crear cuenta una gratis</button></p>
					</div>
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="loginRecoverAccountToggler" class="btn btn-link indexUserLink">¿Olvidaste tu contraseña?</button></p>
					</div>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
		
		<div class="row indexUserRegister">
			<div class="col-md-3"></div>
			<div class="col-md-6 indexUserActions">
				<h4>Registrate gratis</h4>
				
				<form id="registerForm">
					<div class="form-group">
						<input type="text" id="registerEmail" name="registerEmail" class="form-control" placeholder="Email" autofocus maxlength="50">
					</div>
					
					<div class="form-group">
						<input type="text" id="registerName" name="registerName" class="form-control" placeholder="Nombre" autofocus maxlength="50">
					</div>
					
					<div class="form-group">
						<input type="password" id="registerPassword" name="registerPassword" class="form-control" placeholder="Contraseña" autofocus maxlength="50">
					</div>
					
					<div class="form-group">
						<input type="password" id="registerPasswordRepeat" name="registerPasswordRepeat" class="form-control" placeholder="Repetir contraseña" autofocus maxlength="50">
					</div>
					
					<div class="form-group">
						<input type="checkbox" id="registerTerms" name="registerTerms"><a href="#myModal" class="footerLink" data-toggle="modal">Acepto términos y condiciones</a>
					</div>
					
					<button id="btnRegister" class="btn btn-sm btn-info btn-block" type="submit">Registrarte <i class="fa fa-cog fa-spin fa-lg fa-fw registerSpinner"></i></button>
				</form>
				
				<hr>
				
				<div class="row" align="center">
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="registerLoginAccountToggler" class="btn btn-link indexUserLink">Ingresar con tu cuenta</button></p>
					</div>
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="registerRecoverAccountToggler" class="btn btn-link indexUserLink">¿Olvidaste tu contraseña?</button></p>
					</div>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
		
		<div class="row indexUserRecover">
			<div class="col-md-3"></div>
			<div class="col-md-6 indexUserActions">
				<h4>Recuperar contraseña</h4>
				
				<form id="recoverForm">
					<div class="form-group">
						<input type="text" id="recoverEmail" name="recoverEmail" class="form-control" placeholder="Email" autofocus maxlength="50">
					</div>
				
					<button id="btnRecover" class="btn btn-sm btn-info btn-block" type="submit">Recuperar <i class="fa fa-cog fa-spin fa-lg fa-fw recoverSpinner"></i></button>
				</form>
				
				<hr>
				
				<div class="row" align="center">
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="recoverLoginAccountToggler" class="btn btn-link indexUserLink">Ingresar con tu cuenta</button></p>
					</div>
					<div class="col-md-6 indexActionLink" align="center">
						<p><button id="recoverCreateAccountToggler" class="btn btn-link indexUserLink">Crear cuenta una gratis</button></p>
					</div>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</div>

<div id="myModal" class="modal fade termsAndConditions">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title text-info">Términos y condiciones</h4>
			</div>
			<div class="modal-body">
				<h3 class="text-info">Uno</h3>
				<div align="justify">
					Al acceder a este sitio web, aceptas estar obligado por estos términos y condiciones de uso del sitio web, 
					todas las leyes y regulaciones aplicables y aceptas ser responsable del cumplimiento de las leyes locales aplicables. 
					Si no estás de acuerdo con alguno de estos términos, queda prohibido utilizar o acceder a este sitio. 
					Los materiales contenidos en este sitio web están protegidos por las leyes aplicables de derechos de autor y marcas.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Dos</h3>
				<div align="justify">
					Los términos y condiciones del sitio pueden cambiar en cualquier momento. Las modificaciones a estos términos entrarán en vigor 
					inmediatamente después de su publicación en el sitio web. Aceptas y eres responsable de revisar periódicamente este acuerdo para 
					que tengas familiaridad con su contenido. Al continuar utilizando cualquier parte del sitio, significa que aceptas los términos 
					actualizados o revisados. Debes dejar de usar este sitio si no estás de acuerdo con los términos listados.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Tres</h3>
				<div align="justify">
					Solo se puede crear una cuenta. Crear una SEGUNDA cuenta es una VIOLACIÓN de los términos y condiciones y podría resultar en la 
					baja permanente sin previo aviso.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Cuatro</h3>
				<div align="justify">
					El sitio web ofrece servicios de administración de ligas de fútbol gratuitos a los usuarios registrados así como información general
					relacionada con el mundo del fútbol para el resto de la audiencia.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Cinco</h3>
				<div align="justify">
					Protegeremos la información personal mediante medidas de seguridad razonables contra pérdida o robo, así como el acceso no autorizado, 
					divulgación, copia, uso o modificación. Si nos proporciona su dirección de correo electrónico, acepta que el sitio web lo contacte por esta vía.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Seis</h3>
				<div align="justify">
					El sitio web se reserva el derecho de interrumpir el servicio de vez en cuando para realizar el mantenimiento, de forma regular o de 
					cualquier otra forma con o sin previo aviso. Usted acepta que el sitio web no será responsable de ninguna interrupción del servicio o 
					retraso o falla en el desempeño que resulte de cualquier causa.
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Siete</h3>
				<div align="justify">
					El sitio no será responsables de ningún daño (incluyendo, sin limitación, daños por pédida de datos o ganancias, o debido a la 
					
				</div>
				<hr class="clusterScheduleDivider"/>
				
				<h3 class="text-info">Ocho</h3>
				<div align="justify">
					Esperamos que disfrutes de tu estancia en nuestro sitio web. Recuerde que eres un invitado en el sitio web, no olvides actuar con la 
					misma cortesía y respeto que esperarías de otros usuarios. El sitio web siempre se reserva el derecho de rechazar o terminar el servicio. 
					Gracias nuevamente por visitar el sitio web.
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-info btn-sm" data-dismiss="modal">Cerrar</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		$(".form-signin").validate(
				{
					rules: {
						j_username: {
							required: true,
							email: true
						},
						j_password: {
							required: true,
							minlength: 3
						}
					},
					highlight: function(element){
						$(element).closest(".form-group").removeClass("has-success").addClass("has-error");
					},
					unhighlight: function(element){
						$(element).closest(".form-group").removeClass("has-error").addClass("has-success");
					},
					messages: {
						j_username: {
							required: "El email es requerido",
							email: "Email inválido"
						},
						j_password: {
							required: "La contraseña es requerida",
							minlength: "La contraseña debe tener al menos 3 caracteres"
						}
					},
					submitHandler: function(form) {
						$('#btnLogin').prop("disabled", true);
						$('.loginSpinner').css('visibility', 'visible');
						
						$(form).ajaxSubmit();
					 },
					 timeout: 10000
				}
		);
		
		$("#registerForm").validate(
				{
					rules: {
						registerEmail: {
							required: true,
							email: true,
							remote: {
								url: "<spring:url value='/register/available.html' />",
								type: "get",
								data: {
									username: function(){
										return $("#registerEmail").val();
									}
								}
							}
						},
						registerName: {
							required: true,
							minlength: 1
						},
						registerPassword: {
							required: true,
							minlength: 3
						},
						registerPasswordRepeat: {
							required: true,
							minlength: 3,
							equalTo: '#registerPassword'
						},
						registerTerms: {
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
						registerEmail: {
							required: "El email es requerido",
							email: "Email inválido",
							remote: "Email ya registrado. Intenta con otro"
						},
						registerName: "El nombre es requerido",
						registerPassword: {
							required: "La contraseña es requerida",
							minlength: "La contraseña debe tener al menos 3 caracteres"
						},
						registerPasswordRepeat: {
							required: "La contraseña es requerida",
							minlength: "La contraseña debe tener al menos 3 caracteres",
							equalTo: "Las contraseñas no coinciden"
						},
						registerTerms: "Debes aceptar los términos y condiciones"
					},
					submitHandler: function(form) {
						var data = {
					            "email": $('#registerEmail').val(),
					            "name": $('#registerName').val(),
					            "password": $('#registerPassword').val()
					    }
						
						$.ajax({
				            url: "<spring:url value='/register.html' />",
				            type: 'POST',
				            data: JSON.stringify(data),
				            contentType : 'application/json; charset=utf-8',
				            beforeSend: function(){
				            	$('#btnRegister').prop("disabled", true);
								$('.registerSpinner').css('visibility', 'visible');
				            },
				            success: function(response) {
				            	if(response == "0"){
				            		cleanRegisterObjects();
				            		enableRegisterObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify('Registro existoso. En breve recibirás un correo para activar tu cuenta', 'customSuccess', 5);
				            	}else{
				            		enableRegisterObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify(response, 'customError', 5);
				            	}
				            },
				            error: function(e){
				            	cleanRegisterObjects();
			            		enableRegisterObjects();
			            		
			            		alertify.set('notifier','position', 'top-right');
								alertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);
				            },
				            timeout: 10000
				        });
				    }
				}
		);
		
		function cleanRegisterObjects() {
			$('#registerEmail').val('');
			$('#registerName').val('');
			$('#registerPassword').val('');
			$('#registerPasswordRepeat').val('');
			$('#registerTerms').prop('checked', false);
		}
		
		function enableRegisterObjects() {
			$('#btnRegister').prop("disabled", false);
			$('.registerSpinner').css('visibility', 'hidden');
		}
		
		$("#recoverForm").validate(
				{
					rules: {
						recoverEmail: {
							required: true,
							email: true
						}
					},
					highlight: function(element){
						$(element).closest(".form-group").removeClass("has-success").addClass("has-error");
					},
					unhighlight: function(element){
						$(element).closest(".form-group").removeClass("has-error").addClass("has-success");
					},
					messages: {
						recoverEmail: {
							required: "El email es requerido",
							email: "Email inválido"
						}
					},
					submitHandler: function(form) {
						var data = {
					            "email": $('#recoverEmail').val(),
					    }
						
						$.ajax({
				            url: "<spring:url value='/recover.html' />",
				            type: 'POST',
				            data: JSON.stringify(data),
				            contentType : 'application/json; charset=utf-8',
				            beforeSend: function(){
				            	$('#btnRecover').prop("disabled", true);
								$('.recoverSpinner').css('visibility', 'visible');
				            },
				            success: function(response) {
				            	if(response == "0"){
				            		cleanRecoverObjects();
				            		enableRecoverObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify('Recuperación existosa. En breve recibirás un correo con tu nueva contraseña', 'customSuccess', 5);
				            	}else{
				            		enableRecoverObjects();
				            		
				            		alertify.set('notifier','position', 'top-right');
									alertify.notify(response, 'customError', 5);
				            	}
				            },
				            error: function(e){
				            	cleanRecoverObjects();
				            	enableRecoverObjects();
				            	
				            	alertify.set('notifier','position', 'top-right');
								alertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);
				            },
				            timeout: 10000
				        });
				    }
				}
		);
		
		function cleanRecoverObjects() {
			$('#recoverEmail').val('');
		}
		
		function enableRecoverObjects() {
			$('#btnRecover').prop("disabled", false);
			$('.recoverSpinner').css('visibility', 'hidden');
		}
		
		$('#loginCreateAccountToggler').on('click', function() {
			$('.indexUserLogin').toggleClass('closed');
			$('.indexUserRegister').toggleClass('open');
		});
		
		$('#loginRecoverAccountToggler').on('click', function() {
			$('.indexUserLogin').toggleClass('closed');
			$('.indexUserRecover').toggleClass('open');
		});
		
		$('#registerLoginAccountToggler').on('click', function() {
			$('.indexUserLogin').toggleClass('closed');
			$('.indexUserRegister').toggleClass('open');
		});
		
		$('#registerRecoverAccountToggler').on('click', function() {
			$('.indexUserRegister').toggleClass('open');
			$('.indexUserRecover').toggleClass('open');
		});
		
		$('#recoverLoginAccountToggler').on('click', function() {
			$('.indexUserLogin').toggleClass('closed');
			$('.indexUserRecover').toggleClass('open');
		});
		
		$('#recoverCreateAccountToggler').on('click', function() {
			$('.indexUserRegister').toggleClass('open');
			$('.indexUserRecover').toggleClass('open');
		});
	});
</script>