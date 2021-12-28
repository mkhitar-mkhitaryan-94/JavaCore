package lesson14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<Integer,String>(88,"Obobsheniya");
        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("Znachenie: " + v);

        String str = tgObj.getob2();
        System.out.println("Znachenie: " + str);
    }
}
