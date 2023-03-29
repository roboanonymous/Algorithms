package Searching;

public class BinarySearch {
    static void binarySearch(int v[], int To_Find)
    {
        int lo = 0, hi = v.length - 1;

        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (v[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (v[lo] == To_Find) {
            System.out.println("Found At Index " + lo );
        }
        else if (v[hi] == To_Find) {
            System.out.println("Found At Index " + hi );
        }
        else {
            System.out.println("Not Found" );
        }
    }


    public static void main (String[] args) {

        int v[]={1, 3, 4, 5, 6};


        int To_Find = 1;
        binarySearch(v, To_Find);
        To_Find = 6;
        binarySearch(v, To_Find);
        To_Find = 10;
        binarySearch(v, To_Find);
    }
}
