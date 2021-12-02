package homework.education.storage;

import homework.education.util.ArrayUtil;
import homework.education.model.Lesson;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];

        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }


    public void deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                size--;
                System.out.println("Lesson was deleted");
                break;
            }

        }
    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }


}

