package com.gupaoedu.designpattern.factory.absfactory;

import com.gupaoedu.designpattern.factory.bean.AirConditioner;
import com.gupaoedu.designpattern.factory.bean.Ifrige;

public abstract class  AbsFactory {

    public abstract Ifrige makeHaierFrige();

    public abstract Ifrige makeMeidiFrige();

    public abstract AirConditioner makeHaierAirConditioner();

    public abstract AirConditioner makeMeidiAirConditioner();


}
