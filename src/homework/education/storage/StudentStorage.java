package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;

import java.util.LinkedList;



public class StudentStorage {
    private LinkedList<Student> students = new LinkedList<>();


    public void add(Student student) {
        students.add(student);
    }

    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudentByLesson(Lesson lesson) {
        for (Student student : students) {
            for (Lesson studentLesson : student.getLessons()) {
                if (studentLesson.equals(lesson)) {
                    System.out.println(student);
                }
            }
        }
    }

    public void deleteStudentByEmail(Student student) {
        for (Student student1 : students) {
            if (student1.equals(student)) {
                students.remove();
            }
        }
    }

    public Student changeStudentPhone(String phone) {
        for (Student student: students) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    }


