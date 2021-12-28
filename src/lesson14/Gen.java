package lesson14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Tipom T yavlyaetsya " + ob.getClass().getName());

    }
}
