package lesson14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Obekt ob otnositsya k tipu " + ob.getClass().getName());

    }

}

