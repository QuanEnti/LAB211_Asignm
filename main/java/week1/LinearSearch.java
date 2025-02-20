/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;

/**
 *
 * @author HP
 */
public class LinearSearch {
    private int[] arr;

    public LinearSearch() {
    }
    
    public LinearSearch(int n) {
        this.arr = new int[n];
    }
    public void addValue(){
        Random r = new Random();

        for(int i = 0; i < arr.length;i++){
            int temp = r.nextInt(arr.length);
            arr[i] = temp;
        }
    }
    public void displayArray(){
        System.out.print("The array: ");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int searchValue(int x){
        //
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
