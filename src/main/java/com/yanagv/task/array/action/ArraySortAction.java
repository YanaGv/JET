package com.yanagv.task.array.action;

import com.yanagv.task.array.entity.CustomArray;

public class ArraySortAction {
    public void shakerSort(CustomArray array) {
        if (array.length() == 0) {
            return;
        }
        int left = 0;
        int right = array.length() - 1;
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (array.getElement(i - 1) > array.getElement(i)) {
                    swap(array,i - 1, i);
                }
            }
            left++;
            for (int i = left; i < right; ++i) {
                if (array.getElement(i) > array.getElement(i+1)) {
                    swap(array, i, i+1);
                }
            }
            right--;
        }
    }

    public void combSort(CustomArray array) {
        int step = array.length();
        boolean swapped = true;
        while (step > 1 || swapped) {
            if (step > 1)
                step = (int) (step / 1.247);

            int i = 0;
            swapped = false;
            while (i + step < array.length()) {
                if (array.getElement(i) > array.getElement(i+step)) {
                    int t = array.getElement(i);
                    array.setElement(i, array.getElement(i+step)) ;
                    array.setElement(i+step, t);
                    swapped = true;
                }
                i++;
            }
        }
    }

    private void quickSortImpl(CustomArray array, int l, int r) {
        if (l < r) {
            int q = partition(array, l, r);
            quickSortImpl(array, l, q - 1);
            quickSortImpl(array, q + 1, r);
        }
    }

    private int partition(CustomArray array, int l, int r) {
        int x = array.getElement(r);
        int less = l;

        for (int i = l; i < r; ++i) {
            if (array.getElement(i) <= x) {
                swap(array, i, less);
                ++less;
            }
        }
        swap(array, less, r);
        return less;
    }

    public void quickSort(CustomArray array) {
        if (array.length() != 0) {
            quickSortImpl(array, 0, array.length() - 1);
        }
    }

    private void swap(CustomArray array, int firstValueIndex, int secondValueIndex) {
        int firstValue = array.getElement(firstValueIndex);
        int secondValue = array.getElement(secondValueIndex);
        array.setElement(firstValueIndex, secondValue);
        array.setElement(secondValueIndex, firstValue);
    }
}
