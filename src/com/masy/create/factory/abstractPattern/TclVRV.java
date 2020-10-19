package com.masy.create.factory.abstractPattern;

/**
 * tcl空调（具体产品）
 * @author: masy
 * @date: 2020/10/19 18:09
 * @version: 1.0
 */
public class TclVRV implements VRV {

    @Override
    public void showVRV() {
        System.out.println("这是TCL空调");
    }
}
