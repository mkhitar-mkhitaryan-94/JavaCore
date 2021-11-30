package Homework.education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String CHANGE_STUDENT_PHONE = "6";
    private static final String DELETE_LESSON_BY_NAME = "7";
    private static final String DELETE_STUDENT_BY_EMAIL = "8";

    private static void printCommands() {
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

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case CHANGE_STUDENT_PHONE:
                    changeStudentPhone();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!!!");

            }
        }


    }

    private static void changeStudentPhone() {
        System.out.println("please input old phone number");
        studentStorage.print();
        String phone = scanner.nextLine();
        Student student = studentStorage.changePhoneNumber(phone);
        if (phone != null) {
            System.out.println("please input new phone number");
            String newNumber = scanner.nextLine();
            student.setPhone(newNumber);
        } else {
            System.out.println("student's does not exists");
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteStudentByEmail(student);
        } else {
            System.err.println("Student does not exist");
        }

    }

    private static void deleteLessonByName() {
        System.out.println("Please input lesson's name");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteLessonByName(name);
        } else {
            System.err.println("Lesson does not exist");
        }
    }

    private static void printStudentByLesson() {
        System.out.println("please input the name of the lesson");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printStudentByLesson(name);


        } else {
            System.out.println("Student does not exist");
        }
    }

    private static void addStudent() {
        System.out.println("please input  student's name");
        String name = scanner.nextLine();
        System.out.println("please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        System.out.println("please input student's phone");
        String phone = scanner.nextLine();
        System.out.println("please input lesson's name");
        String lessonName = scanner.nextLine();
        String[] lessonNames = lessonName.split(",");
        Lesson[] lessons = new Lesson[lessonNames.length];
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByName(lessonNames[i]) != null) {
                lessons[i] = lessonStorage.getByName(lessonNames[i]);
            } else {
                System.out.println("The lesson doesn't exists");
            }
        }
        Student student = new Student(name, surname, age, email, phone, lessons);
        studentStorage.add(student);
        System.out.println("Thank you,student was added!");

    }

        private static void addLesson () {
            System.out.println("please input lesson name,duration,lecturerName,price");
            String lessonDataStr = scanner.nextLine();
            String[] lessonData = lessonDataStr.split(",");
            if (lessonData.length == 4) {
                Lesson lesson = new Lesson(lessonData[0], Integer.parseInt(lessonData[1]), lessonData[2], Integer.parseInt(lessonData[3]));
                if (lessonStorage.getByName(lesson.getName()) != null) {
                    System.out.println("invalid name !");
                } else {
                    lessonStorage.add(lesson);
                    System.out.println("Thank you,lesson is added");
                }

            } else {
                System.out.println("invalid data");
            }
        }
    }
