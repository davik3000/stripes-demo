package com.example.stripes.demo.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MainActionBean implements ActionBean {

    public static final String DEFAULT_VIEW = "/WEB-INF/jsp/main.jsp";

    private ActionBeanContext ctx;

    public void setContext(ActionBeanContext abc) {
        this.ctx = abc;
    }

    public ActionBeanContext getContext() {
        return this.ctx;
    }

    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(DEFAULT_VIEW);
    }
}
