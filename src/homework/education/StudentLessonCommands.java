package homework.education;

public interface StudentLessonCommands {
     String EXIT = "0";
     String ADD_LESSON = "1";
     String ADD_STUDENT = "2";
     String PRINT_STUDENTS = "3";
     String PRINT_STUDENTS_BY_LESSON = "4";
     String PRINT_LESSONS = "5";
     String CHANGE_STUDENT_PHONE = "6";
     String DELETE_LESSON_BY_NAME = "7";
     String DELETE_STUDENT_BY_EMAIL = "8";

      static void printCommands() {
          System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
          System.out.println("please input " + ADD_LESSON + " for add lesson");
          System.out.println("please input " + ADD_STUDENT + " for add student");
          System.out.println("please input " + PRINT_STUDENTS + " for print students");
          System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student's by lesson");
          System.out.println("please input " + PRINT_LESSONS + " for print lessons");
          System.out.println("please input " + CHANGE_STUDENT_PHONE + " for change student's phone");
          System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
          System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email" + "\u001B[34m");


     }

}
