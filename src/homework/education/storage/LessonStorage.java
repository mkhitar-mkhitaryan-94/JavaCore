package homework.education.storage;


import homework.education.model.Lesson;
import homework.education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class LessonStorage {

    public List<Lesson> lessons = new LinkedList<>();


    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        serialize();
    }

    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    public Lesson getByLessonName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonName)) {
                return lesson;
            }
        }
        return null;
    }

    public void deleteByName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                lessons.remove(lesson);
                serialize();
            }
        }
    }

    private void serialize() {
        FileUtil.serializeLessons(lessons);
    }

    public void initData() {
        List<Lesson> lessonList = FileUtil.deSerializeLessons();
        if (lessonList != null) {
            lessons = lessonList;
        }
    }
}



