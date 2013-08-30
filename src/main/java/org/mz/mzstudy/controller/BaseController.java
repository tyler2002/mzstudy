package org.mz.mzstudy.controller;

import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mz.mzstudy.common.ApplicationHelper;

/**
 * 
 * @author mz.yyam
 * @date 2013-8-30 22:37:59
 */
public abstract class BaseController {
    protected DefaultSqlSessionFactory sqlSessionFactory;
    
    protected void setSqlSessionFactory(){
        if(sqlSessionFactory == null){
            sqlSessionFactory = (DefaultSqlSessionFactory) ApplicationHelper.getBean("sqlSessionFactory");
        }
    }
}
