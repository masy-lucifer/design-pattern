package com.masy.create.factory.abstractPattern;

/**
 * tcl电视（具体产品）
 * @author: masy
 * @date: 2020/10/19 18:11
 * @version: 1.0
 */
public class TclTV implements TV{

    @Override
    public void showTV() {
        System.out.println("这是TCL电视");
    }
}
