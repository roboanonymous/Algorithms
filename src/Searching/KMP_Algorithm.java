package Searching;

import java.util.Arrays;

public class KMP_Algorithm {

    public static void KMP(String text , String pattern)
    {
        int m = pattern.length();
        int n = text.length();
        int arr[] = new int[m];
        zarray(pattern , m , arr);
        System.out.println(Arrays.toString(arr));

        int i=0; //index for text
        int j =0; //index for pattern

        while(n-i >= m-j)
        {
            if(pattern.charAt(j) == text.charAt(i))
            {
                i++;
                j++;
            }

            if(j == m)
            {
                System.out.println("Found pattern at index " + (i - j));
                j = arr[j-1];
            }

            else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = arr[j - 1];
                else
                    i = i + 1;
            }
        }


    }

    public static void zarray(String pattern, int m , int[] arr)
    {
        int len = 0;
        int i = 1;
        arr[0] = 0;

        while (i<m)
        {
            if(pattern.charAt(i) == pattern.charAt(len))
            {
                len++;
                arr[i] = len;
                i++;
            }
            else
            {
                if(len != 0)
                {
                    len = arr[len-1];
                }

                else
                {
                    arr[i] = len;
                    i++;
                }
            }
        }

    }


    public static void main(String args[])
    {
        System.out.println("Hello World");
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        KMP(text , pattern);

    }
}
