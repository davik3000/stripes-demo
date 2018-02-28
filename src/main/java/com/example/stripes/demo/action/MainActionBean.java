package com.example.stripes.demo.action;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MainActionBean implements ActionBean {

    public static final String DEFAULT_VIEW = "/WEB-INF/jsp/main.jsp";

    private ActionBeanContext ctx;

    private List<String> itemList = new ArrayList<>();

    public void setContext(ActionBeanContext abc) {
        this.ctx = abc;
    }

    public ActionBeanContext getContext() {
        return this.ctx;
    }

    @DefaultHandler
    public Resolution view() {
        itemList = generateItemList();

        return new ForwardResolution(DEFAULT_VIEW);
    }

    private List<String> generateItemList() {
        List<String> res = new ArrayList<>();
        res.add("Item1");
        res.add("Item2");
        res.add("Item3");
        return res;
    }

    public List<String> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<String> list) {
        this.itemList = list;
    }
}
