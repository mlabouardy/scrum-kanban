var scrumManager = angular.module('scrumManager', ['ngRoute']);

	scrumManager.config(function($routeProvider,$httpProvider){
		$httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
		$routeProvider
			.when('/',{
				templateUrl:'dashboards.html',
				controller:'dashboardsCtrl'
			})
			.when('/dashboard/:id',{
				templateUrl:'dashboard.html',
				controller:'dashboardCtrl'
			})
			.when('/diagrams',{
				templateUrl:'diagrams.html',
				controller:'dashboardCtrl'
			})
			.when('/team',{
				templateUrl:'team.html',
				controller:'teamCtrl'
			})
			.when('/files',{
				templateUrl:'files.html',
				controller:'filesCtrl'
			})
			.when('/settings',{
				templateUrl:'settings.html',
				controller:'dashboardCtrl'
			})
			.otherwise({redirectTo:'/'});
	});
	
	scrumManager.controller('dashboardsCtrl',function($scope,$http){
		$http.get("http://labouardy.com/tut/dashboards.php").success(function(data){
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
	