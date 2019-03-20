package com.gupaoedu.designpattern.factory.absfactory;

public class Test {
    public static void main(String[] args) {
        AbsFactory factory = new HomeApplianceFactory();
        factory.makeHaierAirConditioner().coolCown();
        factory.makeMeidiAirConditioner().coolCown();
        factory.makeHaierFrige().refrigerate();
        factory.makeMeidiFrige().refrigerate();
    }
}
