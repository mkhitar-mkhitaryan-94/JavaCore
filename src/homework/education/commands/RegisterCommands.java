package homework.education.commands;



public interface RegisterCommands {
    String LOGIN = "0";
    String REGISTER = "1";
    String PRINT_USERS = "2";
    String EXIT = "3";


    static void printCommands() {
        System.out.println("please input " + LOGIN + " for login");
        System.out.println("please input " + REGISTER + " for register");
        System.out.println("please input " + PRINT_USERS + " for print users");
        System.out.println("please input " + EXIT + " for exit");


    }
}
