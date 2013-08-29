<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mzstudy</title>
        <link href="./static/css/bootstrap.min.css" rel="stylesheet">
        <script type="text/javascript" src="./static/js/angular.min.js"></script>
        <script type="text/javascript" src="./dy/js/index.js"></script>
        <style type="text/css">
            body { padding-top: 70px; }
        </style>
    </head>
    <body ng-app>
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <a href="./" class="navbar-brand">Study</a>
            </div>
        </div>
    </nav>
    <div class="container" ng-controller="StudyingList">
        <div class="row">
            <div class="col-lg-2">
                <div class="alert alert-success row" ng-repeat="study in studies">
                    <button type="button" class="btn btn-link" ng-click="load()">{{study}}</button>
                </div>
            </div>
            <div class="col-lg-10" id="studies_content">
                <div ng-repeat="studyContent in studiesContent">
                    <textarea class="form-control" style="height:600px;display:{{studyContent.display}};" name="{{studyContent.study}}"></textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-offset-11" style="margin-top: 10px;">
                <button type="button" class="btn btn-success" style="width: 79px;">Save</button>
            </div>
        </div>
    </div>
</body>
</html>
