package org.mz.mzstudy.controller;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mz.mzstudy.beans.StudyNote;
import org.mz.mzstudy.dao.StudyDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mz.yyam
 * @date 2013-8-30 21:15:50
 */
@Controller
@Component
public class StudyController extends BaseController{
    
    @RequestMapping(method = RequestMethod.GET, value = "/liststudies")
    public ModelAndView listStudies() {
        setSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        StudyDao studyDao = session.getMapper(StudyDao.class);
        List<StudyNote> studies = studyDao.listStudies();
        ModelAndView modelAndView = new ModelAndView("jsonView");
        modelAndView.addObject(studies);
        return modelAndView;
    }
}
