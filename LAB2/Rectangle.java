import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
        double l= in.nextDouble();
        System.out.println("ENTER THE WIDTH OF THE RECTANGLE:");
        double w= in.nextDouble();
        System.out.print("THE AREA OF THE RECTANGLE IS ");
        System.out.println(l*w);
        System.out.print("THE PERIMETER OF THE RECTANGLE IS ");
        System.out.println(2*(l*w));
    }

}
