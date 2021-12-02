package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(55);
        da.add(32);
        da.add(12);
        da.add(78);
        da.add(43);
        da.add(90);
        da.add(2);
        da.add(21);
        da.add(5);
        da.add(8);
        da.add(14);
        da.print();
        System.out.println(da.getByIndex(5));


    }
}
