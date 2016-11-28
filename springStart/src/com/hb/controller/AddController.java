package com.hb.controller;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView();
        GuestDao dao = new GuestDao();
        GuestVo bean = new GuestVo(Integer.parseInt(httpServletRequest.getParameter("sabun"))
                , httpServletRequest.getParameter("name")
                , null
                , Integer.parseInt(httpServletRequest.getParameter("pay")));

        dao.insertOne(bean);
        mav.setViewName("redirect:/list.do");

        return mav;
    }
}
