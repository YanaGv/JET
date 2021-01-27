package com.yanagv.task.array.action;

import com.yanagv.task.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayCalculateActionTest {
    ArrayCalculateAction calculateAction = new ArrayCalculateAction();
    int[] arrayData = {8, 2, 1, 7, 0, 4, -1};
    CustomArray array = new CustomArray(arrayData);

    @Test
    public void testMin() throws Exception{
        Assert.assertEquals(-1, calculateAction.min(array));
    }

    @Test
    public void testMax() throws Exception{
        Assert.assertEquals(8, calculateAction.max(array));
    }

    @Test
    public void testAverage() throws Exception{
        Assert.assertEquals(3, calculateAction.average(array));
    }

    @Test
    public void testSum() throws Exception{
        Assert.assertEquals(21, calculateAction.sum(array));
    }

    @Test
    public void testCountNegativeElements() throws Exception{
        Assert.assertEquals(1, calculateAction.countNegativeElements(array));
    }

    @Test
    public void testcountCountPositiveElements() throws Exception{
        Assert.assertEquals(6, calculateAction.countPositiveElements(array));
    }
}

