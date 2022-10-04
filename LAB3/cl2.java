import java.util.Scanner;

public class cl2 {
    public static void main(String[] args) {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER 1=    ");
        x=in.nextInt();
        if (x>0) {
            System.out.println("POSITIVE");
            if (x < 0) {
                System.out.println("NEGATIVE");
            } else
            {
                System.out.println("0");
            }
        }
    }
}
