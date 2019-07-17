package array;

import java.util.Scanner;

public class Photo
{
    public static void main(String[] args)
    {

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();


        if (w < l && h < l)
        {
            System.out.println("UPLOAD ANOTHER");

        }
        else if ((w >= l && h >= l) && w == h)
        {
            System.out.println("ACCEPTED");
        }
        else if ((w >= l && h >= l) && w != h)
        {
            System.out.println("CROP IT");
        }


    }
}	
