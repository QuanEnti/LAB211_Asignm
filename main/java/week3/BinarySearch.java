/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author HP
 */
public class BinarySearch {
     private int[] array;

    public BinarySearch(int size, int min, int max) {
        array = new int[size];
        generateRandomArray(min, max);
        sortArray();
    }

    private void generateRandomArray(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    private void sortArray() {
        Arrays.sort(array);
    }

    public int[] getArray() {
        return array;
    }

    public int search(int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
}

