package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public  <T> List<List<T>> boxingMethod(T name) {
    List<T> firstList = new ArrayList<T>();
    firstList.add(name);
    List<List<T>> secondList = new ArrayList<List<T>>();
    secondList.add(firstList);
    return secondList;
}

    //TODO: Refactor Method-2
    public  <T extends Object> Object  genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
   public <T, U extends T> void cloneMethod(List<T> consumer, List<U> producer) {
    consumer.addAll(producer);
    }

}
