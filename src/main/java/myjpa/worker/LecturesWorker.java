package myjpa.worker;

import myjpa.data.dao.LecturesDao;
import myjpa.data.entity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}