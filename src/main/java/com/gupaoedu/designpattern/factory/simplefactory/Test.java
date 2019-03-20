package com.gupaoedu.designpattern.factory.simplefactory;

import com.gupaoedu.designpattern.factory.bean.Ifrige;

public class Test {
    public static void main(String[] args) {
        Ifrige haierFrige = new SimpleFactory().makeFrige("海尔");
        haierFrige.refrigerate();
    }
}
