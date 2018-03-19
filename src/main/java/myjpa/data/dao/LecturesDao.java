package myjpa.data.dao;

import myjpa.data.entity.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}
