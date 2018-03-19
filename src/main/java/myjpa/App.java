package myjpa;

import myjpa.data.entity.Lecture;
import myjpa.worker.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);
    }
}