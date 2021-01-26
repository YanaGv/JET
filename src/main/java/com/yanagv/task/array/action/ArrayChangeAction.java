package com.yanagv.task.array.action;

import com.yanagv.task.array.entity.CustomArray;

public class ArrayChangeAction {
    void replaceElements(CustomArray array){
        for (int i = 0; i <array.length(); i++){
            array.setElement(i, Math.abs(array.getElement(i)));
        }
    }
}
