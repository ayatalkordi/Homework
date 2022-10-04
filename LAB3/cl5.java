import java.util.Scanner;

public class cl5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER 1 =  ");
        a=in.nextInt();
        System.out.println("ENTER NUMBER 2 = ");
        b=in.nextInt();
        System.out.println("ENTER NUMBER 3 = ");
        c=in.nextInt();
        if (a>b&b>c)
        {
            System.out.println(a+" "+b+" "+c+"INCREASING");
        }
        else
            if (a<b&b<c)
            {
                System.out.println(a+" "+b+" "+c+"DECREASING");
            }
            else
            {
                System.out.println(a+" "+b+" "+c+"NEITTHER");
            }
    }
}
