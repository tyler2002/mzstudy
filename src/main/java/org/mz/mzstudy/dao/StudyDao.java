package org.mz.mzstudy.dao;

import java.util.List;
import org.mz.mzstudy.beans.StudyNote;

/**
 * study��ز���dao
 * @author mz.yyam
 * @date 2013-8-30 21:52:41
 */
public interface StudyDao {
    List<StudyNote> listStudies();
}
