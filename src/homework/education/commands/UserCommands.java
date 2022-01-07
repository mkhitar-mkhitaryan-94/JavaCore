package homework.education.commands;



public interface UserCommands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";
    String PRINT_USER = "3";


    static void printCommans1() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for exist");
        System.out.println("Please input " + LOGIN + " for user's login");
        System.out.println("Please input " + REGISTER + " for register");
        System.out.println("Please input " + PRINT_USER + " for print user" + "\u001B[0m");
    }
}
