package lesson14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);

        int v = (Integer) iOb.getob();
        System.out.println("Znachenie :" + v);
        System.out.println();

        NonGen strOb = new NonGen("Tekst obobsheni");
        strOb.showType();
        String str = (String) strOb.getob();
        System.out.println("Znachenie : " + str);
        iOb = strOb;
        v = (Integer) iOb.getob();


    }
}
