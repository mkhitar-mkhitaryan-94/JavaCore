package homework.education;

import homework.education.exception.UserNotFoundException;
import homework.education.commands.RegisterCommands;
import homework.education.commands.StudentLessonCommands;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.model.UserType;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class StudentLessonTest implements StudentLessonCommands, RegisterCommands {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws ParseException, UserNotFoundException {
        User user = new User("Poxos", "Poxosyan", "poxosyan@gmail.com", "poxosyan", UserType.USER);
        User user1 = new User("Mkhitar", "Mkhitaryan","mkhitaryan@mail.com","mkhitaryan",UserType.ADMIN);
        User user2 = new User("Martiros", "Martirosyan", "mart@gmail.com", "martirosyan", UserType.USER);
        userStorage.add("poxosyan@gmail.com", user);
        userStorage.add("mkhitaryan@mail.com", user1);
        userStorage.add("mart@gmail.com", user2);

        boolean start = true;
        while (start) {
            RegisterCommands.printCommands();
            String com = scanner.nextLine();
            switch (com) {
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                case PRINT_USERS:
                    userStorage.print();
                    break;
                case RegisterCommands.EXIT:
                    start = false;
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }


    private static void admin() throws ParseException {
        boolean isRun = true;
        StudentLessonCommands.adminCommands();
        while (isRun) {
            String command = scanner.nextLine();
            switch (command) {
                case StudentLessonCommands.EXIT:
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
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }


    private static void user() throws ParseException {
        boolean isRun = true;
        StudentLessonCommands.userCommands();
        while (isRun) {
            String command = scanner.nextLine();
            switch (command) {
                case StudentLessonCommands.EXIT:
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
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }


    private static void register() {
        System.out.println("please input user's name");
        String name = scanner.nextLine();
        System.out.println("please input user's surname");
        String surname = scanner.nextLine();
        System.out.println("please input user's email");
        String email = scanner.nextLine();
        System.out.println("please input user's password");
        String password = scanner.nextLine();
        System.out.println("please input admin or user");

        try {
            userStorage.getByEmail(email);
            System.out.println("User with this email already exists ");
        } catch (UserNotFoundException e) {

            try {
                UserType type = UserType.valueOf(scanner.nextLine().toUpperCase());
                User user = new User(name, surname, email, password, type);
                userStorage.add(email,user);
                System.out.println("Thank you, user was added");
            } catch (IllegalArgumentException a) {
                System.out.println("invalid type");
            }

        }
    }


    private static void login() throws ParseException {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input password");
        String password = scanner.nextLine();
        try {
            User user = userStorage.getByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                if (user.getType() == UserType.USER) {
                    user();
                }
                if (user.getType() == UserType.ADMIN) {
                    admin();
                }
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void changeStudentPhone() {
        System.out.println("please input old phone number");
        studentStorage.print();
        String phone = scanner.nextLine();
        Student student = studentStorage.changeStudentPhone(phone);
        if (phone != null) {
            System.out.println("please input new phone number");
            String newNumber = scanner.nextLine();
            student.setPhone(newNumber);
        } else {
            System.out.println("Student's does not exists");
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
            studentStorage.printStudentByLesson(lesson);


        } else {
            System.out.println("Student does not exist");
        }
    }

    private static void addStudent() throws ParseException {
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
        System.out.println("please input registered date");
        String registeredDate = scanner.nextLine();
        Date date = DateUtil.stringToDate(registeredDate);
        String[] lessonNames = lessonName.split(",");
        Lesson[] lessons = new Lesson[lessonNames.length];
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByName(lessonNames[i]) != null) {
                lessons[i] = lessonStorage.getByName(lessonNames[i]);
            } else {
                System.out.println("The lesson doesn't exists");
            }
        }
        Student student = new Student(name, surname, age, email, phone, date, lessons);
        studentStorage.add(student);
        System.out.println("Thank you,student was added!");

    }

    private static void addLesson() {
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
