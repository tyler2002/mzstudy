function StudyingList($scope){
    $scope.studies = [
        "AngularJS",
        "NodeJS",
        "Jsoup css select",
        "Jerry css select",
        "HttpClient 4.3",
        "Spring 3.x"
    ];
    
    $scope.studiesContent = [
        {
            study : $scope.studies[0],
            display : 'block'
        }
    ];
    
    $scope.load = function(){
        var study = this.study;
        var haveLoad = false;
        for(var i = 0;i<$scope.studiesContent.length;i++){
            var haveLoadStudy = $scope.studiesContent[i];//study in $scope.studiesContent must have been loaded
            if(haveLoadStudy.study === study){
                haveLoadStudy.display = 'block';
                haveLoad = true;
                break;
            } else{
                haveLoadStudy.display = 'none';
            }
        }
        if(!haveLoad){
            $scope.studiesContent.push({
                study : study,
                display : 'block'
            });
        }
    };
}