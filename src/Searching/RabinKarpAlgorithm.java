package Searching;

public class RabinKarpAlgorithm {

    public final static int d = 256;
    public static void Rabinkarp(String text, String pattern, int q)
    {
        int n = text.length();
        int m = pattern.length();
        int p = 0; //hash value of pattern
        int t = 0; // hash value of text
        int h = 1;
        int i,j;

        for(i=0; i<m-1; i++)
        {
            h = (h*d)%q;
        }

        //hashing first window from text and pattern
        for(i=0; i<m; i++)
        {
            t = (t*d + text.charAt(i))%q;
            p = (p*d + pattern.charAt(i))%q;
        }


        for(i=0; i<n-m; i++)
        {
            if(p == t)
            {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if(j == m)
                {
                    System.out.println("Pattern found at index " + i);
                }

            }
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h)
                        + text.charAt(i + m)) % q;

                if (t < 0)
                    t = (t + q);
            }

        }

    }

    public static void main(String args[])
    {
        System.out.println("GEEKS FOR GEEKS");
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";

        int q = 101;

        Rabinkarp(text , pattern ,q);

    }
}
