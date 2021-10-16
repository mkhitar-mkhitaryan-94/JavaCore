package lesson5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = " dva";
        switch(str) {
            case " odin ":
                System.out.println("odin");
                break;
            case " dva ":
                System.out.println("dva");
                break;
            case "tri":
                System.out.println("tri");
                break;
            default:
                System.out.println(" ne sovpalo");
                break;

        }
    }
}
