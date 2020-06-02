package cn.piao888.service;

import cn.piao888.inter.IMyServiceLoader;

public class MyServiceLoaderImpl1 implements IMyServiceLoader {
    @Override
    public String sayHello() {
        return "hello1";
    }
 
    @Override
    public String getName() {
        return "name1";
    }
}
 
