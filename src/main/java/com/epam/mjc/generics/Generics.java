package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    
    public List boxingMethod(List<?> name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public <T> Object genericMethod(List<? extends Object> data) {
        return data;
    }

    public void cloneMethod(List consumer, List producer) {
        consumer.addAll(producer);
    }

}
