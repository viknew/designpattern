package com.gupaoedu.designpattern.factory.methodfactory;

import com.gupaoedu.designpattern.factory.bean.AirConditioner;
import com.gupaoedu.designpattern.factory.bean.HairAirConditioner;
import com.gupaoedu.designpattern.factory.bean.HairFrige;
import com.gupaoedu.designpattern.factory.bean.Ifrige;

public class HaierFactory implements IFactory {
    public Ifrige makeFrige() {
        return new HairFrige();
    }

    public AirConditioner makeAirConditioner() {
        return new HairAirConditioner();
    }
}
