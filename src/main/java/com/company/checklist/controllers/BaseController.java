package com.company.checklist.controllers;

import org.springframework.web.servlet.ModelAndView;

public abstract class BaseController {

    //TODO add base logic

    protected ModelAndView view(String viewName) {
        return new ModelAndView(viewName);
    }
}
