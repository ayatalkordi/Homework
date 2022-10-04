public class BankAccount {


        private double balance;

        /**
         Constructs a bank account with a zero balance
         */
        public BankAccount()
        {
            balance = 0;
        }

        /**
         Constructs a bank account with a given balance
         @param initialBalance the initial balance
         */
        public BankAccount(double initialBalance)
        {
            balance = initialBalance;
        }

        /**
         Deposits money into the bank account.
         @param amount the amount to deposit
         */
        public void deposit(double amount)
        {
            double newBalance = balance + amount;
            balance = newBalance;
        }

//public static void main (String[] args) {


}



