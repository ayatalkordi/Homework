import java.util.Scanner;

public class Circle {
    public static void main (String[] args) {

        Scanner in= new Scanner(System.in);
        double pi=3.14;
        System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
        double radius= in.nextDouble();
        System.out.print("THE AREA OF THE CIRCLE IS ");
        System.out.println(pi*radius*radius);
        System.out.print("THE PERIMETER OF THE CIRCLE IS ");
        System.out.println(2*pi*radius);
    }
}
