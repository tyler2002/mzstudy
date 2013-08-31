function StudyingList($scope, $http){
    $http.get("./study/listStudies").success(function(data){
        $scope.studies = data.studyNoteList;
        //根据id得到studyNote
        var defaultStudy = $scope.studies[0];
        $http.get("./study/getStudyNote/" + defaultStudy.id).success(function(studyNote){
            $scope.studiesContent = [
                {
                    study : defaultStudy.title,
                    studyId : defaultStudy.id,
                    display : 'block',
                    studyNote : studyNote.studyNote
                }
            ];
        });
        $scope.selected = defaultStudy.id;
    });
    
    $scope.studyClass = function(study){
        return study.id === $scope.selected ? 'list-group-item active' : "list-group-item";
    };
    
    /**
     * 点击学习标题，加载对应的学习笔记
     */
    $scope.load = function(study){
        var haveLoad = false;
        $scope.selected = study.id;
        for(var i = 0;i<$scope.studiesContent.length;i++){
            var haveLoadStudy = $scope.studiesContent[i];//study in $scope.studiesContent must have been loaded
            
            //save the study note that show before
            
            if(haveLoadStudy.study === study.title){
                haveLoadStudy.display = 'block';
                haveLoad = true;// can not break,because all of others should be set display = none
            } else{
                haveLoadStudy.display = 'none';
            }
        }
        if (!haveLoad) {
            $http.get("./study/getStudyNote/" + study.id).success(function(studyNote) {
                $scope.studiesContent.push({
                    study: study.title,
                    studyId: study.id,
                    display: 'block',
                    studyNote: studyNote.studyNote
                });
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