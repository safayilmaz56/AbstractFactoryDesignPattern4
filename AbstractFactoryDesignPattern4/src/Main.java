public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba(new FordFocusFactory());
        araba.arabaOlustur();
        System.out.println("-----------------");
        araba = new Araba(new MercedesFactory());
        araba.arabaOlustur();
    }
}