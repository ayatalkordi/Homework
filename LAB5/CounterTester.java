public class CounterTester {

    public static void main (String[] args) {
        Counter m= new Counter();
        System.out.println("TEST 1");
        System.out.println(m.getValue());
        System.out.println("EXPECTED RESULT: 0");
        System.out.println("TEST 2");
        m.click();
        m.click();
        m.click();
        System.out.println(m.getValue());
        System.out.println("EXPECTED RESULT: 3");
        System.out.println("TEST 3");
        m.reset();
        System.out.println(m.getValue());
        System.out.println("EXPECTED RESULT: 0");


    }
}
