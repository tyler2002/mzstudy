package org.mz.mzstudy.controller;

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
public class StudyController {

    @RequestMapping(method = RequestMethod.GET, value = "/liststudies")
    public ModelAndView getEmployee() {
        System.out.println("------------------list--------------------");
        return new ModelAndView();
    }
}
