package homework.education;

import homework.education.commands.UserCommands;
import homework.education.exception.UserNotFoundException;
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
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentLessonTest implements StudentLessonCommands {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws ParseException {
        initData();

        boolean isRun = true;
        while (isRun) {
            UserCommands.printCommans1();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommands.EXIT:
                    isRun = false;
                    break;
                case UserCommands.LOGIN:
                    login();
                    break;
                case UserCommands.REGISTER:
                    userRegister();
                    break;
                case UserCommands.PRINT_USER:
                    userStorage.print();
                    break;
                default:
                    System.err.println("invalid commands");
            }
        }
    }

    private static void initData() {
        lessonStorage.initData();
        studentStorage.initData();
        userStorage.initData();
    }

    private static void userRegister() {
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        try {
            userStorage.getByEmail(email);
            System.out.println("invalid user,try again");
            userRegister();
        } catch (UserNotFoundException e) {
            System.out.println("Please input user's name");
            String name = scanner.nextLine();
            System.out.println("Please input user's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input user's password");
            String password = scanner.nextLine();
            System.out.println("Please input user's type(user or admin)");
            UserType userType = UserType.valueOf(scanner.nextLine());

            if (userType == UserType.USER || userType == UserType.ADMIN) {
                User user = new User();
                user.setEmail(email);
                user.setName(name);
                user.setSurname(surname);
                user.setPassword(password);
                user.setType(userType);
                userStorage.addUser(email, user);
                System.out.println("Thank you user was added");
            } else {
                System.out.println("Invalid type: Please try again");
            }
        }
    }

    private static void login() {
        System.out.println("Please choose user's email");
        String email = scanner.nextLine();

        try {
            User user = userStorage.getByEmail(email);
            System.out.println("Please input user's password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                if (user.getType() == UserType.USER) {
                    userCommands();
                } else if (user.getType() == UserType.ADMIN) {
                    adminCommands();
                }
            } else {
                System.out.println("Your email is " + email);
                System.out.println(" Forget password" );
                System.out.println("Please choose user's name");
                String name = scanner.nextLine();
                if (!user.getName().equals(name)) {
                    System.out.println("Invalid user: Try again");
                    login();
                }
                System.out.println("Please choose user's surname");
                String surname = scanner.nextLine();
                if (user.getSurname().equals(surname)) {
                    System.out.println("Please input new password");
                    String password1 = scanner.nextLine();
                    user.setPassword(password1);
                }
            }
        } catch (UserNotFoundException | ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void adminCommands() throws ParseException {
        boolean isRun1 = true;
        while (isRun1) {
            StudentLessonCommands.printAdminCommands();
            String command1 = scanner.nextLine();
            switch (command1) {
                case EXIT:
                    isRun1 = false;
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
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.err.println("Invalid command");
                    break;
            }
        }
    }

    private static void userCommands() throws ParseException {
        boolean isRun2 = true;
        while (isRun2) {
            StudentLessonCommands.printUserCommands();
            String command2 = scanner.nextLine();
            switch (command2) {
                case EXIT:
                    isRun2 = false;
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
                    System.err.println("Invalid command");
                    break;
            }
        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("Please choose student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteStudent(student);
        } else {
            System.out.println("Student does not exists");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("Please choose lesson's name");
        String name = scanner.nextLine();
        if (lessonStorage.getByLessonName(name) != null) {
            lessonStorage.deleteByName(name);
        } else {
            System.out.println("Lesson does not exists");
        }
    }

    private static void printStudentByLesson() {
        System.out.println("Please choose lessons name! name1,name2,...");
        String lessonsName = scanner.nextLine();
        String[] lessonArray = lessonsName.split(",");
        if (lessonArray.length == 0) {
            System.out.println("Please choose lesson's name");
            return;
        }
        Set<Lesson> lessons = new HashSet<>();
        for (String lesson : lessonArray) {
            Lesson lessonName = lessonStorage.getByLessonName(lesson);
            if (lessonName != null) {
                lessons.add(lessonName);
            } else {
                System.out.println("Invalid lesson's name");
                return;
            }
            studentStorage.printStudentByLesson(lessonName);
        }
    }

    private static void addStudent() throws ParseException {
        System.out.println("please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student == null) {
            System.out.println("please input student's name");
            String name = scanner.nextLine();
            System.out.println("please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input student's phone");
            String phone = scanner.nextLine();
            System.out.println("please input student's date of birth[12/12/2021]");
            String dateStr = scanner.nextLine();
            Date date = DateUtil.stringToDate(dateStr);
            lessonStorage.print();
            System.out.println("Please choose lesson's name! name1,name2,name3,....");
            String lessonNameStr = scanner.nextLine();
            String[] lessonName = lessonNameStr.split(",");
            if (lessonName.length == 0) {
                System.out.println("please choose lesson's name");
                return;
            }
            Set<Lesson> lessons = new HashSet<>();
            for (int i = 0; i < lessonName.length; i++) {
                Lesson lesson = lessonStorage.getByLessonName(lessonName[i]);
                if (lesson != null) {
                    lessons.add(lesson);
                } else {
                    System.out.println("invalid lesson");
                    return;
                }
            }
            Student student1 = new Student(name, surname, age, email, phone, lessons, date);
            studentStorage.add(student1);
            System.out.println("Thank you,student was added");
        } else {
            System.err.println("Invalid email! Please try again");
            addStudent();
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson name,duration,lecturerName,price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            Lesson lesson = new Lesson(lessonData[0], Integer.parseInt(lessonData[1]), lessonData[2], Integer.parseInt(lessonData[3]));
            if (lessonStorage.getByLessonName(lesson.getName()) != null) {
                System.out.println("invalid name !");
            } else {
                lessonStorage.addLesson(lesson);
                System.out.println("Thank you,lesson is added");
            }

        } else {
            System.out.println("invalid data");
        }
    }
}
