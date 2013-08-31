package org.mz.mzstudy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.mz.mzstudy.beans.StudyNote;
import org.mz.mzstudy.dao.StudyDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @RequestMapping(method = RequestMethod.GET, value = "/listStudies")
    public ModelAndView listStudies() {
        setSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        try{
            StudyDao studyDao = session.getMapper(StudyDao.class);
            List<StudyNote> studies = studyDao.listStudies();
            ModelAndView modelAndView = new ModelAndView("jsonView");
            modelAndView.addObject(studies);
            return modelAndView;
        } finally{
            session.close();
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getStudyNote/{id}")
    public ModelAndView getStudyNote(@PathVariable Integer id) {
        setSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        try{
            StudyDao studyDao = session.getMapper(StudyDao.class);
            String studyNote = studyDao.getStudyNote(id);
            ModelAndView modelAndView = new ModelAndView("jsonView");
            modelAndView.addObject("studyNote", studyNote);
            return modelAndView;
        } finally{
            session.close();
        }
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/updateStudyNote/{id}")
    public ModelAndView updateStudyNote(@PathVariable Integer id, @RequestBody String body) {
        setSqlSessionFactory();
        JSONObject bodyObj = JSON.parseObject(body);
        String studyNote = bodyObj.getString("studyNote");
        SqlSession session = sqlSessionFactory.openSession();
        try{
            StudyDao studyDao = session.getMapper(StudyDao.class);
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("id", id);
            param.put("noteContent", studyNote);
            studyDao.updateStudyNote(param);
            ModelAndView modelAndView = new ModelAndView("jsonView");
            modelAndView.addObject("success", true);
            modelAndView.addObject("msg", "±£´æ³É¹¦");
            return modelAndView;
        } finally{
            session.close();
        }
    }
}
