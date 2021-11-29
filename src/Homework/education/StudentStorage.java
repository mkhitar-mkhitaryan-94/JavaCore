package Homework.education;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void deleteStudentByEmail(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                ArrayUtil.deleteByIndex(students, i, size);
                size--;
                break;
            }
        }
    }

    public void printStudentByLesson(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(name)) {
                System.out.println(students[i]);
            }

        }

    }


    public Student changePhoneNumber(String phone) {
        for (int i = 0; i < size; i++) {
            if (students[i].getPhone().equals(phone)) {
                return students[i];
            }
        }
        return null;
    }
}
