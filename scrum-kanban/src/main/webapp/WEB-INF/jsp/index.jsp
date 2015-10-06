<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>

.content-body{
	height:100%;
	float:left;
}
.lists-tasks{
	width:100%;
	height:100%;
}

.lists-tasks > li{
	display:inline;
	float:left;
	width:300px;
	height:100%;
	margin-right:5px;
	margin-left:5px;
	margin-top:5px;
	margin-bottom:5px;
	background:#1AB394;
}

.lists-tasks > li:FIRST-CHILD {
	margin-left:10px;
}

.list-title{
width:100%;
height:40px;
text-align: center;
font-family:Roboto;
color:#FFF;
line-height: 40px;
font-weight:bolder;
border-bottom: 1px #FFF solid;
}

.btn-padding-title{
	margin-right:5px;
	margin-top:3px;
}

.tasks{
	background: #1AB394;
	height:100%;
	width:100%;
	margin:0;padding:0;
	
}

.tasks >li{
	background:#23C6C8;
	
	border:1px #FFF solid;
	border-radius:5px;
	display:block;
	width:90%;
	height:200px;
	margin-left:15px;
	margin-top:5px;
	margin-bottom:5px;
}

.task-title{
	height:150px;
	width:100%;
	border-bottom:1px #FFF solid;
	text-align: center;
	color:#FFF;
	font-family:Roboto;
	font-size:22px;
}

.task-title a{
	margin-left:3px;
	margin-top:1px;
}

.task-time {
	width:100%;
}

.task-time > ul{
	width:100%;
	
	padding:0;
}

.task-time li{
	display:inline-block;
	width:33%;
	border-right:1px #fff solid;
	float:left;
	height:50px;
	font-size:17px;
	line-height: 50px;
	text-align:center;
	color:#fff;
}
.task-time li:first-child{
	margin-left:1px;
}

.task-time li:last-child{
	border-right:0px;
}
</style>
<div class="side-bar">
	<ul class="sidebar-nav">
		<li class="sidebar-brand"><a href="#"> Scrum Manager </a></li>
		<li><a href="#"><i class="fa fa-th-large"></i>Dashboard</a></li>
		<li><a href="#"><i class="fa fa-bar-chart"></i>Diagrams</a></li>
		<li><a href="#"><i class="fa fa-users"></i>Team</a></li>
		<li><a href="#"><i class="fa fa-files-o"></i>Files</a></li>
		<li><a href="#"><i class="fa fa-cogs"></i>Settings</a></li>
	</ul>
</div>
<div class="content-body">
	<ul class="lists-tasks">
		<li>
			<div class="list-title">To do<a href="#" class="btn btn-primary pull-right btn-padding-title"><i class="fa fa-calendar-plus-o"></i></a></div>
			<div >
				<ul class="tasks">
					<li>
						<div class="task-title">Modele</div>
						<div class="task-time">
							<ul>
								<li>4</li>
								<li>3</li>
								<li>1.5</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</li>
		<li>
			<div class="list-title">In progress<a href="#" class="btn btn-primary pull-right btn-padding-title"><i class="fa fa-calendar-plus-o"></i></a></div>
			<div >
				<ul class="tasks">
					<li>
						<div class="task-title">Modele</div>
						<div class="task-time">
							<ul>
								<li>4</li>
								<li>3</li>
								<li>1.5</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</li>
		<li>
			<div class="list-title">Done<a href="#" class="btn btn-primary pull-right btn-padding-title"><i class="fa fa-calendar-plus-o"></i></a></div>
			<div >
				<ul class="tasks">
					<li>
						<div class="task-title">Modele</div>
						<div class="task-time">
							<ul>
								<li>4</li>
								<li>3</li>
								<li>1.5</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</li>
	</ul>
</div>


<script>
var scrumManager=angular.module('scrumManager',[]);

scrumManager.controller('testCtrl',function($scope){
	$scope.names=['ok','454','ff'];
});
</script>