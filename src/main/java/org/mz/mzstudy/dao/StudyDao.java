package org.mz.mzstudy.dao;

import java.util.List;
import java.util.Map;
import org.mz.mzstudy.beans.StudyNote;

/**
 * studyÏà¹Ø²Ù×÷dao
 * @author mz.yyam
 * @date 2013-8-30 21:52:41
 */
public interface StudyDao {
    List<StudyNote> listStudies();
    String getStudyNote(Integer id);
    void updateStudyNote(Map<String, Object> param);
}
