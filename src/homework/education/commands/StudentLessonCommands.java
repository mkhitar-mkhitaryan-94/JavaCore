package homework.education.commands;

public interface StudentLessonCommands {
    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";

    static void printAdminCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for Exit");
        System.out.println("please input " + ADD_LESSON + " for lessons");
        System.out.println("please input " + ADD_STUDENT + " for student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lesson");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email" + "\u001B[0m");

    }

    static void printUserCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for Exit");
        System.out.println("please input " + ADD_LESSON + " for lessons");
        System.out.println("please input " + ADD_STUDENT + " for student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lesson" + "\u001B[0m");
    }


}