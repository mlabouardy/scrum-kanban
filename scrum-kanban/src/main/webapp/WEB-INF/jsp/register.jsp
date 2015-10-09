<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="middle-box">
	<form:form commandName="user">
		<c:if test="${param.success eq true}">
			<div class="alert alert-success">Registration successful !</div>
		</c:if>
		<div class="form-group">
			<label for="name">Username:</label>
			<form:input path="username" cssClass="form-control" />
		</div>
		<div class="form-group">
			<label for="name">Email:</label>
			<form:input path="email" cssClass="form-control" />
		</div>
		<div class="form-group">
			<label for="name">Password:</label>
			<form:password path="password" cssClass="form-control" />
		</div>
		<input type="submit"
			class="btn btn-success btn-block btn-custom-color" value="Register" />
	</form:form>
	<p class="text-muted text-center">
		<small>Already have an account?</small>
	</p>
</div>