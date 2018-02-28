/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.stripes.demo.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import net.sourceforge.stripes.action.StreamingResolution;

public class DialogActionBean implements ActionBean {

    public static final String DEFAULT_VIEW = "/WEB-INF/jsp/dialog.jsp";

    private ActionBeanContext ctx;

    private String id;
    private String title;
    private String description;

    public void setContext(ActionBeanContext abc) {
        this.ctx = abc;
    }

    public ActionBeanContext getContext() {
        return this.ctx;
    }

    @DefaultHandler
    public Resolution view() {
        if (this.title == null) {
            this.title = "Some meaningful title";
        }

        Integer count = this.getCachedCounter();
        if (count == null) {
            count = 0;
        }
        if (count != null) {
            this.description = "Hit counter: " + count;
        }
        count++;
        this.setCachedCounter(count);

        return new ForwardResolution(DEFAULT_VIEW);
//        return new StreamingResolution("text", new StringReader(DEFAULT_VIEW));
    }

    public String getId() {
        return this.title;
    }

    public void setId(String t) {
        this.title = t;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    private static final String CTX_SESSION_ATTRIB_COUNTER = "counter";

    private Integer getCachedCounter() {
        Integer res = null;
        Object ctxObj = this.ctx.getServletContext().getAttribute(CTX_SESSION_ATTRIB_COUNTER);
        if (ctxObj instanceof Integer) {
            res = (Integer) ctxObj;
        }

        return res;
    }

    private void setCachedCounter(Integer i) {
        if (i != null) {
            this.ctx.getServletContext().setAttribute(CTX_SESSION_ATTRIB_COUNTER, i);
        }
    }
}
