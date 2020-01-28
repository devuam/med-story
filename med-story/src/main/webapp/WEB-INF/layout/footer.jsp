<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>


<security:authorize access="isAuthenticated()">
  	<div align="center" class="generalFooter">
		<h1><i class="fa fa-copyright"></i> AndAppsForAll</h1>
	</div>
</security:authorize>
