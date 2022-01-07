package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.util.FileUtil;

import java.util.ArrayList;
import java.util.List;


public class StudentStorage {
    private List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
        serialize();
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

    public void deleteStudent(Student student) {
        for (Object o : students.toArray()) {
            if (o.equals(student)) {
                students.remove(o);
                serialize();
            }
        }
    }

    private void serialize() {
        FileUtil.serializeStudents(students);
    }

    public void initData() {
        List<Student> studentList = FileUtil.deSerializeStudents();
        if (studentList != null) {
            students = studentList;
        }
    }


}


