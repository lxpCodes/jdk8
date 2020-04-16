package com.study.method;

/**
 * @ClassName StudentComparator
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 16:39
 **/
public class StudentComparator {

    public int compareByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }

    public int compareByName(Student student1, Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
