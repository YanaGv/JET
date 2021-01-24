package com.yanagv.task.array.action;

public class ArrayCalculateAction {
    public int min(int[] array) {
        int minValue = array[0];
        for (int element : array) {
            if (minValue > element) {
                minValue = element;
            }
        }
        return minValue;
    }

    public int max(int[] array) {
        int maxValue = array[0];
        for (int element : array) {
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public double average(int[] array) {
        int sum;
        double averageValue;
        sum = sum(array);
        averageValue = (double) sum / array.length;
        return averageValue;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public int countNegativeElements(int[] array) {
        int count = 0;
        for (int element: array){
            if (element < 0){
                count++;
            }
        }
        return count;
    }

    public int countPositiveElements(int[] array) {
        int count = 0;
        for (int element: array){
            if (element >= 0){
                count++;
            }
        }
        return count;
    }
}
