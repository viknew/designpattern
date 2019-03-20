package com.gupaoedu.designpattern.factory.methodfactory;

import com.gupaoedu.designpattern.factory.bean.AirConditioner;
import com.gupaoedu.designpattern.factory.bean.Ifrige;

public class MethodTest {
    public static void main(String[] args) {
        IFactory haierFactory = new HaierFactory();

        Ifrige haierFrige = haierFactory.makeFrige();
        haierFrige.refrigerate();
        AirConditioner haierAirConditioner = haierFactory.makeAirConditioner();
        haierAirConditioner.coolCown();

        IFactory meidiFactory = new MeidiFactory();

        Ifrige meidiFrige = meidiFactory.makeFrige();
        meidiFrige.refrigerate();
        AirConditioner meidiAirConditioner = meidiFactory.makeAirConditioner();
        meidiAirConditioner.coolCown();
    }
}
