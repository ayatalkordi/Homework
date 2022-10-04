public class cl3 {
    public static void main(String[] args) {
        String ayat=new String("MISSISSIPPI");
        ayat=ayat.replace("i","!");
        ayat=ayat.replace("s","$");
        System.out.println("ACTUAL :"+ayat);
        System.out.println("EXPECTED : M!$$!$$!pp!");
    }
}
