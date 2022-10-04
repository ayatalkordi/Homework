import java.awt.*;
import java.util.Scanner;

public class cl1 {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE WIDTH ");
        width=input.nextInt();
        System.out.println("ENTER THE HEIGHT ");
        height=input.nextInt();
        Rectangle a=new Rectangle(width,height);
        System.out.println("ACTUAL PERIMTER="+2 *(a.getWidth()+a.getHeight()));
        System.out.println("EXPECTED PERIMTER ="+2 *(height+width));
    }
}
