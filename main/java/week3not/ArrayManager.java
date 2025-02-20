/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3not;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author HP
 */
public class ArrayManager {
    private int[] arr;
    
    public ArrayManager(int size, int maxValue) {
        arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue + 1); 
        }
    }


    public void bubbleSort() {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    
    public void QuickSort( int l, int r){
        int i = Partition(l,r);
        if(i < r) QuickSort(i,r);
        if(l<i-1) QuickSort(l,i-1);
    }
    public void quickSort() {
        QuickSort(0, arr.length - 1);
    }
    
    public int Partition(int l, int r){
        int i = l;int j = r;
        int pv = arr[(l + r)/2];
        while(i<=j){
            while(arr[i]<pv) i++;
            while(arr[j]>pv) j--;
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        return i;
    }
    
    
    
    private void sortArray() {
        Arrays.sort(arr);
    }

    public int[] getArray() {
        return arr;
    }

    public int BinarySearch(int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
    
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void displayArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

