package cn.piao888.service;

import cn.piao888.inter.IMyServiceLoader;

public class MyServiceLoaderImpl2 implements IMyServiceLoader {
    @Override
    public String sayHello() {
        return "hello2";
    }
 
    @Override
    public String getName() {
        return "name2";
    }
}
