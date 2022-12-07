/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author yabdo
 */
public class MergeSort {

     void merge(int arr[], int p, int q, int r) {

   
    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];

   
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

 
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

 
  void mergeSort(int arr[], int l, int r) {
    if (l < r) {

      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      merge(arr, l, m, r);
    }
  }
    
    
    
    
    
    
    
    
    
   
    public static void main(String[] args) {
        
          int[] data2 = {9, 5, 1, 4, 3,45,24,2,0 };
          MergeSort ob = new MergeSort();
    ob.mergeSort(data2, 0, data2.length - 1);

   
    System.out.print("MergeSort------->");
    System.out.println(Arrays.toString(data2));
    }
    
}
