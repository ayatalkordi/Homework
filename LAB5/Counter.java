public class Counter {

    private int value;
    public void click() {
        value++;
    }

    public int getValue() {
        return value;
    }
    public void reset() {
        value=0;
    }
    public static void main (String[] args) {
        Counter c= new Counter();
        c.click();
        c.click();
        System.out.println(c.getValue());
        c.reset();
        System.out.println(c.getValue());
    }
}

