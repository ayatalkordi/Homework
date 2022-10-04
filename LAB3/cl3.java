import java.util.Scanner;

public class cl3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("ENTER NUMBER: ");
        x = in.nextInt();
        if (x < 0) {
            x = x * -1;
            System.out.println(x);
        } else {
            System.out.println(x);
        }
        if (x < 10 && x > 0) {
            System.out.println(1);
        } else if (x < 100 && x > 10) {
            System.out.println(2);
        } else
            if (x < 1000 && x > 100)
        {
            System.out.println(3);
        }
            else
                if (x<10000&&x>1000)
                {
                    System.out.println(4);
                }
                else
                    if (x < 100000 && x > 10000)
                    {
                        System.out.println(5);
                    }
                    else
                        if (x < 1000000 && x > 100000)
                        {
                            System.out.println(6);
                        }
                        else
                            if (x < 10000000 && x > 1000000)
                            {
                                System.out.println(7);
                            }
                            else
                                if (x < 100000000 && x > 10000000)
                                {
                                    System.out.println(8);
                                }
                                else
                                    if (x < 1000000000 && x > 100000000)
                                    {
                                        System.out.println(9);
                                    }
    }
}
