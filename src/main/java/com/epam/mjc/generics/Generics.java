package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

       public <T> List<List<String>> boxingMethod(T name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(String.valueOf(name));
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public <T> T genericMethod(T data) {
        return data;
    }


    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
