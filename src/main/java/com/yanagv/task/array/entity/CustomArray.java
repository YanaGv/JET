package com.yanagv.task.array.entity;

import com.yanagv.task.array.exeption.CustomArrayException;

public class CustomArray implements Comparable<CustomArray>{
    int[] array;

    public CustomArray() {
        this.array = new int[0];
    }

    public CustomArray(int... args) {
        int size = args.length;
        this.array = new int[size];
        for (int i : args) {
            this.array[i] = args[i];
        }
    }

    public CustomArray(int size) throws CustomArrayException {
        if (size >= 0){
            this.array = new int[0];
        } else {
            throw new CustomArrayException("Negative size");
        }

    }

    public int getElement(int index) {
        return this.array[index];
    }
    public void setElement(int index, int value){
        this.array[index] = value;
    }
    public int length() {
        return this.array.length;
    }
    public String toString(){
        String label = "[";
        StringBuilder stringBuilder = new StringBuilder();
        for(int element: this.array){
            stringBuilder.append(element + " ");
        }
        label += stringBuilder.toString();
        label += "]";
        return label;
    }

    @Override
    public int compareTo(CustomArray comparableArray) {
        return this.array.length - comparableArray.length();
    }

}
