<%@ include file="../layout/taglibs.jsp" %>

<div class="side-bar">
	<ul class="sidebar-nav">
		<li class="sidebar-brand"><a href="#"> Scrum Manager </a></li>
		<li><a href="#/"><i class="fa fa-th-large"></i>Dashboard</a></li>
		<li><a href="#/diagrams"><i class="fa fa-bar-chart"></i>Diagrams</a></li>
		<li><a href="#/team"><i class="fa fa-users"></i>Team</a></li>
		<li><a href="#/files"><i class="fa fa-files-o"></i>Files</a></li>
		<li><a href="#/settings"><i class="fa fa-cogs"></i>Settings</a></li>
		<br/>
		<li><a href="#"><i class="fa fa-sign-out"></i>Logout</a></li>
	</ul>
</div>
<div class="content-body">
	<div ng-view></div>
</div>