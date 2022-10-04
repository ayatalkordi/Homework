public class CashTest {
    public static void main(String[] args) {
        CashRegister me = new CashRegister();
        me.getInfo("Chocalate ", 10);
        me.getInfo("Chips ", 5);
        me.getInfo("Pepsi ", 15);
        me.getInfo("chocalate ", 8);
        me.getInfo("chocalate ", 12);
        me.printReceipt();
    }
}
