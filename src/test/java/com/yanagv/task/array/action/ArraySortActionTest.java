package com.yanagv.task.array.action;

import com.yanagv.task.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArraySortActionTest {
    ArraySortAction sortAction = new ArraySortAction();
    int[] arrayData = {8, 2, 1, 7, 0, 4, -1};
    int[] actualArrayData = {-1, 0, 1, 2, 4, 7, 8};
    CustomArray actualArray = new CustomArray(actualArrayData);
    CustomArray array;

    @BeforeTest
    public void configTest(){
        this.array = new CustomArray(arrayData);
    }

    @AfterTest
    public void finishTest(){
        this.array = null;
    }

    @Test
    public void testShakerSort() throws Exception{
        boolean isEquals;
        sortAction.shakerSort(array);
        isEquals = actualArray.equals(array);
        Assert.assertTrue(isEquals);
    }

    @Test
    public void testQuickSort() throws Exception{
        boolean isEquals;
        sortAction.quickSort(array);
        isEquals = actualArray.equals(array);
        Assert.assertTrue(isEquals);
    }

    @Test
    public void testCombSort() throws Exception{
        boolean isEquals;
        sortAction.combSort(array);
        isEquals = actualArray.equals(array);
        Assert.assertTrue(isEquals);
    }
}

