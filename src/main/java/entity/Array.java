package entity;

import java.awt.*;

public class Array{
    int size;
    Integer[] values;

    public Array() {
        values = new Integer[0];
        size = 0;
    }
    public Array(Integer firstNum) {
        values = new Integer[1];
        values[0] = firstNum;
        size = 1;
    }
    public Integer getById(int id){
        try {
            return values[id];
        }catch (Exception ex){
            System.out.println("Id overflow");
        }
        return 0;
    }


}
