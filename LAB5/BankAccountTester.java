public class BankAccountTester {

    public static void main(String[] args){
        BankAccountTester bank = new BankAccountTester();
        bank.deposit(1000);
        bank.withdraw(500);
        bank.withdraw(400);
        System.out.println("The bank account has a balance of $"+bank.getBalance());
        System.out.println("Expected output: $100.0");
       // System.out.println();
        BankAccountTester momsSavings = new BankAccountTester();
        momsSavings.addInterest(10);
        System.out.println("Mom's savings bank account value: $"+momsSavings.getBalance());
        System.out.print("Expected output: $1100.0");
    }

    private double getBalance() {
        double Balance=0.0;
        return Balance;
    }

    private void addInterest(int i) {

    }

    private void deposit(int i) {
        
    }

    private void withdraw(int i) {
        
    }
}








