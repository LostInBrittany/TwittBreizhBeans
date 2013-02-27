<!doctype html>
<html lang="en" ng-app="twittBreizhBeans">
	<head>
		<meta charset="utf-8">
		<title>Twitt BreizhBeans</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Twitt BreizhBeans demo app using Angular JS and MongoDB">
        <meta name="author" content="Horacio 'LostInBrittany' Gonzalez">

        <!-- Le styles -->
        <link href="lib/bootstrap/css/bootstrap.css" rel="stylesheet">

        <link href="lib/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="css/app.css"/>
	</head>
	<body>

        <div ng-controller="PageCtrl"  ng-include="navbar.url"></div>






            <div class="container" ng-view></div>


            <!-- In production use:
            <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.4/angular.min.js"></script>
            -->
            <script src="lib/angular/angular.js"></script>
            <script src="lib/angular/angular-resource.js"></script>
            <script src="lib/jquery/jquery.js"></script>
            <script src="lib/bootstrap/js/bootstrap.js"></script>
            <script src="js/app.js"></script>
            <script src="js/services.js"></script>
            <script src="js/controllers.js"></script>
            <script src="js/filters.js"></script>
            <script src="js/directives.js"></script>
            <script src="js/grails.js"></script>



	</body>
</html>
