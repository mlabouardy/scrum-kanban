<%@ include file="../layout/taglibs.jsp" %>

<div class="middle-box">
	<form>
		<div class="form-group">
			<label for="name">Username:</label>
			<input type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label for="name">Password:</label>
			<input type="password" class="form-control"/>
		</div>
		<input type="submit" class="btn btn-success btn-block btn-custom-color"  value="Login"/>
	</form>
	<a class="btn btn-sm btn-white btn-block" href="register.html">Forgot password ?</a>
	<p class="text-muted text-center"><small>Do not have an account?</small></p>
    <a class="btn btn-sm btn-white btn-block" href="<spring:url value="/register.html"/>">Create an account</a>
	
</div>
    