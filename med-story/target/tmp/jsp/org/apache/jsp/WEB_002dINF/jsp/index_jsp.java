package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/../layout/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_spring_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<img src='");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("' alt=\"logo\" class=\"indexImageHeader\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"indexUserContainer\">\r\n");
      out.write("\t\t<div class=\"row indexUserLogin\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 indexUserActions\">\r\n");
      out.write("\t\t\t\t<h4>Ingresa con tu cuenta</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form class=\"form-signin\" action='");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("' method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"j_username\" class=\"form-control\" placeholder=\"Email\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"j_password\" class=\"form-control\" placeholder=\"Contraseña\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"btnLogin\" class=\"btn btn-sm btn-info btn-block\" type=\"submit\">Ingresar <i class=\"fa fa-cog fa-spin fa-lg fa-fw loginSpinner\"></i></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"loginCreateAccountToggler\" class=\"btn btn-link indexUserLink\">Crear cuenta una gratis</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"loginRecoverAccountToggler\" class=\"btn btn-link indexUserLink\">¿Olvidaste tu contraseña?</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row indexUserRegister\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 indexUserActions\">\r\n");
      out.write("\t\t\t\t<h4>Registrate gratis</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form id=\"registerForm\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"registerEmail\" name=\"registerEmail\" class=\"form-control\" placeholder=\"Email\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"registerName\" name=\"registerName\" class=\"form-control\" placeholder=\"Nombre\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"registerPassword\" name=\"registerPassword\" class=\"form-control\" placeholder=\"Contraseña\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"registerPasswordRepeat\" name=\"registerPasswordRepeat\" class=\"form-control\" placeholder=\"Repetir contraseña\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"registerTerms\" name=\"registerTerms\"><a href=\"#myModal\" class=\"footerLink\" data-toggle=\"modal\">Acepto términos y condiciones</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button id=\"btnRegister\" class=\"btn btn-sm btn-info btn-block\" type=\"submit\">Registrarte <i class=\"fa fa-cog fa-spin fa-lg fa-fw registerSpinner\"></i></button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"registerLoginAccountToggler\" class=\"btn btn-link indexUserLink\">Ingresar con tu cuenta</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"registerRecoverAccountToggler\" class=\"btn btn-link indexUserLink\">¿Olvidaste tu contraseña?</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row indexUserRecover\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 indexUserActions\">\r\n");
      out.write("\t\t\t\t<h4>Recuperar contraseña</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form id=\"recoverForm\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"recoverEmail\" name=\"recoverEmail\" class=\"form-control\" placeholder=\"Email\" autofocus maxlength=\"50\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button id=\"btnRecover\" class=\"btn btn-sm btn-info btn-block\" type=\"submit\">Recuperar <i class=\"fa fa-cog fa-spin fa-lg fa-fw recoverSpinner\"></i></button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"recoverLoginAccountToggler\" class=\"btn btn-link indexUserLink\">Ingresar con tu cuenta</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 indexActionLink\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<p><button id=\"recoverCreateAccountToggler\" class=\"btn btn-link indexUserLink\">Crear cuenta una gratis</button></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"myModal\" class=\"modal fade termsAndConditions\">\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title text-info\">Términos y condiciones</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Uno</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tAl acceder a este sitio web, aceptas estar obligado por estos términos y condiciones de uso del sitio web, \r\n");
      out.write("\t\t\t\t\ttodas las leyes y regulaciones aplicables y aceptas ser responsable del cumplimiento de las leyes locales aplicables. \r\n");
      out.write("\t\t\t\t\tSi no estás de acuerdo con alguno de estos términos, queda prohibido utilizar o acceder a este sitio. \r\n");
      out.write("\t\t\t\t\tLos materiales contenidos en este sitio web están protegidos por las leyes aplicables de derechos de autor y marcas.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Dos</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tLos términos y condiciones del sitio pueden cambiar en cualquier momento. Las modificaciones a estos términos entrarán en vigor \r\n");
      out.write("\t\t\t\t\tinmediatamente después de su publicación en el sitio web. Aceptas y eres responsable de revisar periódicamente este acuerdo para \r\n");
      out.write("\t\t\t\t\tque tengas familiaridad con su contenido. Al continuar utilizando cualquier parte del sitio, significa que aceptas los términos \r\n");
      out.write("\t\t\t\t\tactualizados o revisados. Debes dejar de usar este sitio si no estás de acuerdo con los términos listados.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Tres</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tSolo se puede crear una cuenta. Crear una SEGUNDA cuenta es una VIOLACIÓN de los términos y condiciones y podría resultar en la \r\n");
      out.write("\t\t\t\t\tbaja permanente sin previo aviso.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Cuatro</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tEl sitio web ofrece servicios de administración de ligas de fútbol gratuitos a los usuarios registrados así como información general\r\n");
      out.write("\t\t\t\t\trelacionada con el mundo del fútbol para el resto de la audiencia.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Cinco</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tProtegeremos la información personal mediante medidas de seguridad razonables contra pérdida o robo, así como el acceso no autorizado, \r\n");
      out.write("\t\t\t\t\tdivulgación, copia, uso o modificación. Si nos proporciona su dirección de correo electrónico, acepta que el sitio web lo contacte por esta vía.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Seis</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tEl sitio web se reserva el derecho de interrumpir el servicio de vez en cuando para realizar el mantenimiento, de forma regular o de \r\n");
      out.write("\t\t\t\t\tcualquier otra forma con o sin previo aviso. Usted acepta que el sitio web no será responsable de ninguna interrupción del servicio o \r\n");
      out.write("\t\t\t\t\tretraso o falla en el desempeño que resulte de cualquier causa.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Siete</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tEl sitio no será responsables de ningún daño (incluyendo, sin limitación, daños por pédida de datos o ganancias, o debido a la \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clusterScheduleDivider\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3 class=\"text-info\">Ocho</h3>\r\n");
      out.write("\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\tEsperamos que disfrutes de tu estancia en nuestro sitio web. Recuerde que eres un invitado en el sitio web, no olvides actuar con la \r\n");
      out.write("\t\t\t\t\tmisma cortesía y respeto que esperarías de otros usuarios. El sitio web siempre se reserva el derecho de rechazar o terminar el servicio. \r\n");
      out.write("\t\t\t\t\tGracias nuevamente por visitar el sitio web.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-info btn-sm\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\".form-signin\").validate(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\trules: {\r\n");
      out.write("\t\t\t\t\t\tj_username: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\temail: true\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tj_password: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\tminlength: 3\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\thighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-success\").addClass(\"has-error\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tunhighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-error\").addClass(\"has-success\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tmessages: {\r\n");
      out.write("\t\t\t\t\t\tj_username: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"El email es requerido\",\r\n");
      out.write("\t\t\t\t\t\t\temail: \"Email inválido\"\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tj_password: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"La contraseña es requerida\",\r\n");
      out.write("\t\t\t\t\t\t\tminlength: \"La contraseña debe tener al menos 3 caracteres\"\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsubmitHandler: function(form) {\r\n");
      out.write("\t\t\t\t\t\t$('#btnLogin').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t\t$('.loginSpinner').css('visibility', 'visible');\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(form).ajaxSubmit();\r\n");
      out.write("\t\t\t\t\t },\r\n");
      out.write("\t\t\t\t\t timeout: 10000\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#registerForm\").validate(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\trules: {\r\n");
      out.write("\t\t\t\t\t\tregisterEmail: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\temail: true,\r\n");
      out.write("\t\t\t\t\t\t\tremote: {\r\n");
      out.write("\t\t\t\t\t\t\t\turl: \"");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttype: \"get\",\r\n");
      out.write("\t\t\t\t\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusername: function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn $(\"#registerEmail\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterName: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\tminlength: 1\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterPassword: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\tminlength: 3\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterPasswordRepeat: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\tminlength: 3,\r\n");
      out.write("\t\t\t\t\t\t\tequalTo: '#registerPassword'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterTerms: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\thighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-success\").addClass(\"has-error\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tunhighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-error\").addClass(\"has-success\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tmessages: {\r\n");
      out.write("\t\t\t\t\t\tregisterEmail: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"El email es requerido\",\r\n");
      out.write("\t\t\t\t\t\t\temail: \"Email inválido\",\r\n");
      out.write("\t\t\t\t\t\t\tremote: \"Email ya registrado. Intenta con otro\"\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterName: \"El nombre es requerido\",\r\n");
      out.write("\t\t\t\t\t\tregisterPassword: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"La contraseña es requerida\",\r\n");
      out.write("\t\t\t\t\t\t\tminlength: \"La contraseña debe tener al menos 3 caracteres\"\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterPasswordRepeat: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"La contraseña es requerida\",\r\n");
      out.write("\t\t\t\t\t\t\tminlength: \"La contraseña debe tener al menos 3 caracteres\",\r\n");
      out.write("\t\t\t\t\t\t\tequalTo: \"Las contraseñas no coinciden\"\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tregisterTerms: \"Debes aceptar los términos y condiciones\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsubmitHandler: function(form) {\r\n");
      out.write("\t\t\t\t\t\tvar data = {\r\n");
      out.write("\t\t\t\t\t            \"email\": $('#registerEmail').val(),\r\n");
      out.write("\t\t\t\t\t            \"name\": $('#registerName').val(),\r\n");
      out.write("\t\t\t\t\t            \"password\": $('#registerPassword').val()\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t            url: \"");
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      out.write("\",\r\n");
      out.write("\t\t\t\t            type: 'POST',\r\n");
      out.write("\t\t\t\t            data: JSON.stringify(data),\r\n");
      out.write("\t\t\t\t            contentType : 'application/json; charset=utf-8',\r\n");
      out.write("\t\t\t\t            beforeSend: function(){\r\n");
      out.write("\t\t\t\t            \t$('#btnRegister').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.registerSpinner').css('visibility', 'visible');\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            success: function(response) {\r\n");
      out.write("\t\t\t\t            \tif(response == \"0\"){\r\n");
      out.write("\t\t\t\t            \t\tcleanRegisterObjects();\r\n");
      out.write("\t\t\t\t            \t\tenableRegisterObjects();\r\n");
      out.write("\t\t\t\t            \t\t\r\n");
      out.write("\t\t\t\t            \t\talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\t\talertify.notify('Registro existoso. En breve recibirás un correo para activar tu cuenta', 'customSuccess', 5);\r\n");
      out.write("\t\t\t\t            \t}else{\r\n");
      out.write("\t\t\t\t            \t\tenableRegisterObjects();\r\n");
      out.write("\t\t\t\t            \t\t\r\n");
      out.write("\t\t\t\t            \t\talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\t\talertify.notify(response, 'customError', 5);\r\n");
      out.write("\t\t\t\t            \t}\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            error: function(e){\r\n");
      out.write("\t\t\t\t            \tcleanRegisterObjects();\r\n");
      out.write("\t\t\t            \t\tenableRegisterObjects();\r\n");
      out.write("\t\t\t            \t\t\r\n");
      out.write("\t\t\t            \t\talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\talertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            timeout: 10000\r\n");
      out.write("\t\t\t\t        });\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction cleanRegisterObjects() {\r\n");
      out.write("\t\t\t$('#registerEmail').val('');\r\n");
      out.write("\t\t\t$('#registerName').val('');\r\n");
      out.write("\t\t\t$('#registerPassword').val('');\r\n");
      out.write("\t\t\t$('#registerPasswordRepeat').val('');\r\n");
      out.write("\t\t\t$('#registerTerms').prop('checked', false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction enableRegisterObjects() {\r\n");
      out.write("\t\t\t$('#btnRegister').prop(\"disabled\", false);\r\n");
      out.write("\t\t\t$('.registerSpinner').css('visibility', 'hidden');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#recoverForm\").validate(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\trules: {\r\n");
      out.write("\t\t\t\t\t\trecoverEmail: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\t\t\t\temail: true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\thighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-success\").addClass(\"has-error\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tunhighlight: function(element){\r\n");
      out.write("\t\t\t\t\t\t$(element).closest(\".form-group\").removeClass(\"has-error\").addClass(\"has-success\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tmessages: {\r\n");
      out.write("\t\t\t\t\t\trecoverEmail: {\r\n");
      out.write("\t\t\t\t\t\t\trequired: \"El email es requerido\",\r\n");
      out.write("\t\t\t\t\t\t\temail: \"Email inválido\"\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsubmitHandler: function(form) {\r\n");
      out.write("\t\t\t\t\t\tvar data = {\r\n");
      out.write("\t\t\t\t\t            \"email\": $('#recoverEmail').val(),\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t            url: \"");
      if (_jspx_meth_spring_url_3(_jspx_page_context))
        return;
      out.write("\",\r\n");
      out.write("\t\t\t\t            type: 'POST',\r\n");
      out.write("\t\t\t\t            data: JSON.stringify(data),\r\n");
      out.write("\t\t\t\t            contentType : 'application/json; charset=utf-8',\r\n");
      out.write("\t\t\t\t            beforeSend: function(){\r\n");
      out.write("\t\t\t\t            \t$('#btnRecover').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.recoverSpinner').css('visibility', 'visible');\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            success: function(response) {\r\n");
      out.write("\t\t\t\t            \tif(response == \"0\"){\r\n");
      out.write("\t\t\t\t            \t\tcleanRecoverObjects();\r\n");
      out.write("\t\t\t\t            \t\tenableRecoverObjects();\r\n");
      out.write("\t\t\t\t            \t\t\r\n");
      out.write("\t\t\t\t            \t\talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\t\talertify.notify('Recuperación existosa. En breve recibirás un correo con tu nueva contraseña', 'customSuccess', 5);\r\n");
      out.write("\t\t\t\t            \t}else{\r\n");
      out.write("\t\t\t\t            \t\tenableRecoverObjects();\r\n");
      out.write("\t\t\t\t            \t\t\r\n");
      out.write("\t\t\t\t            \t\talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\t\talertify.notify(response, 'customError', 5);\r\n");
      out.write("\t\t\t\t            \t}\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            error: function(e){\r\n");
      out.write("\t\t\t\t            \tcleanRecoverObjects();\r\n");
      out.write("\t\t\t\t            \tenableRecoverObjects();\r\n");
      out.write("\t\t\t\t            \t\r\n");
      out.write("\t\t\t\t            \talertify.set('notifier','position', 'top-right');\r\n");
      out.write("\t\t\t\t\t\t\t\talertify.notify('Ocurrió un problema. Intente más tarde', 'customError', 5);\r\n");
      out.write("\t\t\t\t            },\r\n");
      out.write("\t\t\t\t            timeout: 10000\r\n");
      out.write("\t\t\t\t        });\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction cleanRecoverObjects() {\r\n");
      out.write("\t\t\t$('#recoverEmail').val('');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction enableRecoverObjects() {\r\n");
      out.write("\t\t\t$('#btnRecover').prop(\"disabled\", false);\r\n");
      out.write("\t\t\t$('.recoverSpinner').css('visibility', 'hidden');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#loginCreateAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserLogin').toggleClass('closed');\r\n");
      out.write("\t\t\t$('.indexUserRegister').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#loginRecoverAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserLogin').toggleClass('closed');\r\n");
      out.write("\t\t\t$('.indexUserRecover').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#registerLoginAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserLogin').toggleClass('closed');\r\n");
      out.write("\t\t\t$('.indexUserRegister').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#registerRecoverAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserRegister').toggleClass('open');\r\n");
      out.write("\t\t\t$('.indexUserRecover').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#recoverLoginAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserLogin').toggleClass('closed');\r\n");
      out.write("\t\t\t$('.indexUserRecover').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#recoverCreateAccountToggler').on('click', function() {\r\n");
      out.write("\t\t\t$('.indexUserRegister').toggleClass('open');\r\n");
      out.write("\t\t\t$('.indexUserRecover').toggleClass('open');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/images/logoMedstory.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/j_spring_security_check");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty SPRING_SECURITY_LAST_EXCEPTION}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<script>\r\n");
        out.write("\t\t\t\t\t\talertify.set('notifier','position', 'top-right');\r\n");
        out.write("\t\t\t\t\t\talertify.notify(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SPRING_SECURITY_LAST_EXCEPTION.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\", 'customError', 5);\r\n");
        out.write("\t\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/register/available.html");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent(null);
    _jspx_th_spring_url_2.setValue("/register.html");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_3 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_3.setParent(null);
    _jspx_th_spring_url_3.setValue("/recover.html");
    int[] _jspx_push_body_count_spring_url_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_3 = _jspx_th_spring_url_3.doStartTag();
      if (_jspx_th_spring_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_3.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_3);
    }
    return false;
  }
}
