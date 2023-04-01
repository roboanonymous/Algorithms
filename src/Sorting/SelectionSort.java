package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selection(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n ;i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
