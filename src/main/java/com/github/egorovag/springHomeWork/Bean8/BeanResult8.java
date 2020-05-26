package com.github.egorovag.springHomeWork.Bean8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanResult8 {
    List<InterfaceForBeans> beansList;

    @Autowired
    public BeanResult8(List<InterfaceForBeans> beansList) {
        this.beansList = beansList;
    }

    public List<InterfaceForBeans> getBeans() {
        return beansList;
    }
}
