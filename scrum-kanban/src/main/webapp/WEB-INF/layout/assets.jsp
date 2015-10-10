<%@ include file="../layout/taglibs.jsp"%>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Bootstrap icons -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<!-- Custom style -->
<link rel="stylesheet" href="<spring:url value="/resources/css/style.css"/>">

<!--  JQuery script -->
<script src="https://code.jquery.com/jquery-2.1.4.min.js" /></script>

<!-- Boostrap js -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<!-- AngularJS core -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.0-beta.1/angular.min.js"></script>

<!-- AngularJS Route -->
<script src="https://code.angularjs.org/1.4.7/angular-route.min.js"></script>

<!-- AngularJS App -->
<!-- <script src="<spring:url value="/resources/js/app.js"/>"></script>  -->
<script>
var scrumManager = angular.module('scrumManager', ['ngRoute']);

scrumManager.config(function($routeProvider,$httpProvider){
	$httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
	$routeProvider
		.when('/',{
			templateUrl:'/resources/partials/dashboards.html',
			controller:'dashboardsCtrl'
		})
		.when('/dashboard/:id',{
			templateUrl:'/resources/partials/dashboard.html',
			controller:'dashboardCtrl'
		})
		.when('/diagrams',{
			templateUrl:'/resources/partials/diagrams.html',
			controller:'dashboardCtrl'
		})
		.when('/team',{
			templateUrl:'/resources/partials/team.html',
			controller:'teamCtrl'
		})
		.when('/files',{
			templateUrl:'/resources/partials/files.html',
			controller:'filesCtrl'
		})
		.when('/settings',{
			templateUrl:'/resources/partials/settings.html',
			controller:'dashboardCtrl'
		})
		.otherwise({redirectTo:'/'});
});

scrumManager.controller('dashboardsCtrl',function($scope,$http){
	$http.get("api/dashboards.json").success(function(data){
		$scope.dashboards=data;
	});
});

scrumManager.controller('dashboardCtrl', function($scope, $http) {
	
	$http.get("http://labouardy.com/tut/tasks.php").success(function(data){
		$scope.list1=data.list1;
		$scope.list2=data.list2;
		$scope.list3=data.list3;
	});
});

scrumManager.controller('teamCtrl',function($scope,$http){
	$http.get("http://labouardy.com/tut/team.php").success(function(data){
		$scope.team=data;
	});
});

scrumManager.controller('filesCtrl',function($scope,$http){
	$http.get("http://labouardy.com/tut/files.php").success(function(data){
		$scope.files=data;
	});
});

$(document).on('click', '.panel-heading span.clickable', function(e){
    var $this = $(this);
	if(!$this.hasClass('panel-collapsed')) {
		$this.parents('.panel').find('.panel-body').slideUp();
		$this.addClass('panel-collapsed');
		$this.find('i').removeClass('fa fa-chevron-down').addClass('fa fa-chevron-up');
	} else {
		$this.parents('.panel').find('.panel-body').slideDown();
		$this.removeClass('panel-collapsed');
		$this.find('i').removeClass('fa fa-chevron-up').addClass('fa fa-chevron-down');
	}
})

</script>

<!-- ChartJS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/1.0.2/Chart.min.js"></script>