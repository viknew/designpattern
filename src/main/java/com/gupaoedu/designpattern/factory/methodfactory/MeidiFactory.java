package com.gupaoedu.designpattern.factory.methodfactory;

import com.gupaoedu.designpattern.factory.bean.AirConditioner;
import com.gupaoedu.designpattern.factory.bean.Ifrige;
import com.gupaoedu.designpattern.factory.bean.MeidiAirConditioner;
import com.gupaoedu.designpattern.factory.bean.MeidiFrige;

public class MeidiFactory implements IFactory {
    public Ifrige makeFrige() {
        return new MeidiFrige();
    }

    public AirConditioner makeAirConditioner() {
        return new MeidiAirConditioner();
    }
}
