package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

      public <T> List boxingMethod(T name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public <T> Object genericMethod(Object data) {
        return data;
    }
    
    public <T extends Number> void cloneMethod(List<Number> consumer, List<T> producer) {
        consumer.addAll(producer);
    }

}
