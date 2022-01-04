package homework.education.storage;


import homework.education.model.Lesson;

import java.util.LinkedList;

public class LessonStorage {
    private LinkedList<Lesson> lessons = new LinkedList<>();


    public void add(Lesson lesson) {
        lessons.add(lesson);
    }


    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }


    public void deleteLessonByName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                lessons.remove(lesson);
            }
        }
    }

    public Lesson getByName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                return lesson;
            }
        }
        return null;
    }


}

