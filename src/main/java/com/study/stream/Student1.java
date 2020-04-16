package com.study.stream;

/**
 * @ClassName Student1
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/16 11:44
 **/
public class Student1 {

    private String name;

    private int socre;

    private int rank;

    public Student1(String name, int socre, int rank) {
        this.name = name;
        this.socre = socre;
        this.rank = rank;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", socre=" + socre +
                ", rank=" + rank +
                '}';
    }
}
