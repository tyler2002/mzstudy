function StudyingList($scope, $http){
    $http.get("./study/listStudies").success(function(data){
        $scope.studies = data.studyNoteList;
        $scope.studiesContent = [
            {
                study : $scope.studies[0].title,
                studyId : $scope.studies[0].id,
                display : 'block',
                studyNote : ''
            }
        ];
    });
    
    $scope.load = function(){
        var study = this.study;
        var haveLoad = false;
        for(var i = 0;i<$scope.studiesContent.length;i++){
            var haveLoadStudy = $scope.studiesContent[i];//study in $scope.studiesContent must have been loaded
            if(haveLoadStudy.study === study.title){
                haveLoadStudy.display = 'block';
                haveLoad = true;// can not break,because all of others should be set display = none
            } else{
                haveLoadStudy.display = 'none';
            }
        }
        if(!haveLoad){
            $scope.studiesContent.push({
                study : study.title,
                studyId : study.id,
                display : 'block',
                studyNote : ''
            });
        }
    };
    
    $scope.save = function(){
        //find the current study
        for(var i = 0;i<$scope.studiesContent.length;i++){
            var haveLoadStudy = $scope.studiesContent[i];
            if(haveLoadStudy.display === 'block'){
                $http.post("./study/updateStudyNote/" + haveLoadStudy.studyId, {
                    studyNote : haveLoadStudy.studyNote
                });
                break;
            }
        }
    };
}