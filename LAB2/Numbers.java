import java.util.Scanner;

public class Numbers {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS:");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        System.out.print("THE AVRAGE IS ");
        System.out.println((x+y+z)/3);
    }
}
