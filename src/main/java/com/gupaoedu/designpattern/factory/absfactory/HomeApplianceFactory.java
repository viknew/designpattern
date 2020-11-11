package com.gupaoedu.designpattern.factory.absfactory;

import com.gupaoedu.designpattern.factory.bean.*;

/**
 * 家电类工厂
 */
public class HomeApplianceFactory extends AbsFactory {
    public Ifrige makeHaierFrige() {
        return new HairFrige();
    }

    public Ifrige makeMeidiFrige() {
        return new MeidiFrige();
    }

    public AirConditioner makeHaierAirConditioner() {
        return new HairAirConditioner();
    }

    public AirConditioner makeMeidiAirConditioner() {
        return new MeidiAirConditioner();
    }
}
