package com.hb.controller;

import com.hb.model.GuestDao;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        GuestDao dao = new GuestDao();
        List list = dao.selectAll();
        httpServletRequest.setAttribute("alist", list);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("guest/list");

        return mav;
    }
}
