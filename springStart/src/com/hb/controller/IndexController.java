package com.hb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest Request, HttpServletResponse Response) throws Exception {
        ModelAndView mav = new ModelAndView();
        Request.setAttribute("msg", "Spring");
        mav.setViewName("index");
        return mav;
    }
}
