import java.util.Scanner;

public class cl1 {
    public static void main(String[] args) {
        int x;
        String y,color;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER FORM 1 TO 8");
        x=in.nextInt();
        System.out.println("ENTER NUMBER a TO h ");
        y= in.next();
        if (y.equals("x")|| y.equals("c")|| y.equals("e")|| y.equals("g"))
            if (x%2!=0)
            {
                color=" black";
                System.out.println(color);
            }
        else
            {
                color="white";
                System.out.println(color);
            }
        if (y.equals("b")|| y.equals("d")|| y.equals("f")|| y.equals("h"))
            if (x%2==0)
            {
                color="black";
                System.out.println(color);
            }
        else
            {
                color="white";
                System.out.println(color);
            }
    }
}
