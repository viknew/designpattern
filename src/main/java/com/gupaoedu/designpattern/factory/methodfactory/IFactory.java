package com.gupaoedu.designpattern.factory.methodfactory;

import com.gupaoedu.designpattern.factory.bean.AirConditioner;
import com.gupaoedu.designpattern.factory.bean.Ifrige;

public interface IFactory {
    /**
     * 制造冰箱
     * @return 冰箱
     */
    public Ifrige makeFrige();

    /**
     * 制造空调
     * @return 空调
     */
    public AirConditioner makeAirConditioner();
}
