package entity;

import java.awt.*;

public class Array {
    int size;
    Object[] values;

    public Array() {
        values = new Object[0];
        size = 0;
    }
    public Array(int size) {
        this.values = new Object[size];
        this.size = size;
    }

}
