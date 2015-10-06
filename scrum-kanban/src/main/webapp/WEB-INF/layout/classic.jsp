<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html ng-app="scrumManager">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title"></tiles:getAsString></title>
<tiles:insertAttribute name="assets"/>
</head>
<body>
</body>
	<div class="wrapper">
	<tiles:insertAttribute name="body" />
		<br />
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>