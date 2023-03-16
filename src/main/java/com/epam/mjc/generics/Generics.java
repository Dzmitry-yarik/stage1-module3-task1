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

    public List boxingMethod(String name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public Object genericMethod(Object data) {
        return data;
    }
    
    public <T extends Number> void cloneMethod(List<Number> consumer, List<Integer> producer) {
        consumer.addAll(producer);
    }

}
