package com.study.method;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 16:18
 **/
public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }

    public static int compareByName(Student student1, Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareStuByScore(Student student){
        return this.getScore() -student.getScore();
    }

    public int compareStuByName(Student student){
        return this.getName().compareToIgnoreCase(student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
