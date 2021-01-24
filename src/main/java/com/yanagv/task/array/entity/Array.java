package com.yanagv.task.array.entity;


import com.yanagv.task.array.exeption.ArrayException;

public class Array {
    int[] array;

    public Array() {
        this.array = new int[0];
    }

    public Array(int... args) {
        int size = args.length;
        this.array = new int[size];
        for (int i : args) {
            this.array[i] = args[i];
        }
    }

    public int getById(int id) throws ArrayException {
        if (id > this.array.length || id < 0) {
            throw new ArrayException("Wrong id: "+id);
        }
        return this.array[id];
    }

    public int lenght() {
        return this.array.length;
    }
}
