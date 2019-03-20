package com.gupaoedu.designpattern.factory.simplefactory;

import com.gupaoedu.designpattern.factory.bean.HairFrige;
import com.gupaoedu.designpattern.factory.bean.Ifrige;
import com.gupaoedu.designpattern.factory.bean.MeidiFrige;

public class SimpleFactory {

    public Ifrige makeFrige(String type){
        if ("海尔".equals(type)){
            return new HairFrige();
        }
        else if ("美的".equals(type)){
            return new MeidiFrige();
        }
        return null;
    }


}
