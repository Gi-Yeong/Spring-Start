package com.hb.controller;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailController implements Controller {
    private GuestDao dao;

    public void setDao(GuestDao dao) {
        this.dao = dao;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String param = httpServletRequest.getParameter("idx");
        int sabun = Integer.parseInt(param);
        ModelAndView mav = new ModelAndView();
        GuestVo bean = dao.selectOne(sabun);
        mav.addObject("dto", bean);
        mav.setViewName("guest/detail");

        return mav;
    }
}
