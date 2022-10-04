public class Balance {
    public static void main (String[] args) {
        System.out.println("The initial balance is 1000$");
        System.out.print("The interest per year =");
        System.out.print(1000*0.05);
        System.out.println("$");
        System.out.print("The balance after the first year =");
        System.out.print(1000+(1000*0.05));
        System.out.println("$");
        System.out.print("The balance after the second year =");
        System.out.print(1000+(1000*0.05)+(1000*0.05));
        System.out.println("$");
        System.out.print("The balance after the third year =");
        System.out.print(1000+(1000*0.05)+(1000*0.05)+(1000*0.05));
        System.out.println("$");

    }
}
