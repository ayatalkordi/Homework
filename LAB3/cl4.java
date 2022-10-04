import jdk.swing.interop.LightweightFrameWrapper;

import java.util.Scanner;

public class cl4 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER 1 =  ");
        x=in.nextInt();
        System.out.println("ENTER NUMBER 2 =   ");
        y=in.nextInt();
        System.out.println("ENTER NUMBER 3 =   ");
        z=in.nextInt();
        if (x==y&y==z)
        {
            System.out.println("ALL THE SAME ");
        }
        else
            if (x!=y&y!=z)
            {
                System.out.println("ALL THE DIFFERENT ");
            }
            else
            {
                System.out.println("NEITHER");
            }
    }
}
