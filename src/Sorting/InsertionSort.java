package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertion(int[] arr)
    {
        int n = arr.length;
        for(int i = 1; i<n ;i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key)
            {
                {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
