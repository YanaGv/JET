package com.yanagv.task.array.action;

import com.yanagv.task.array.entity.CustomArray;

public class ArrayCalculateAction {
    public int min(CustomArray array) {
        int minValue = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if (minValue > array.getElement(i)) {
                minValue = array.getElement(i);
            }
        }
        return minValue;
    }

    public int max(CustomArray array) {
        int maxValue = array.getElement(0);
        for (int i = 1; i < array.length(); i++) {
            if (maxValue < array.getElement(i)) {
                maxValue = array.getElement(i);
            }
        }
        return maxValue;
    }

    public double average(CustomArray array) {
        int sum;
        double averageValue;
        sum = sum(array);
        averageValue = (double) sum / array.length();
        return averageValue;
    }

    public int sum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.length(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }

    public int countNegativeElements(CustomArray array) {
        int count = 0;
        for (int i = 0; i < array.length(); i++){
            if (array.getElement(i) < 0){
                count++;
            }
        }
        return count;
    }

    public int countPositiveElements(CustomArray array) {
        int count = 0;
        for (int i = 0; i < array.length(); i++){
            if (array.getElement(i) >= 0){
                count++;
            }
        }
        return count;
    }
}
