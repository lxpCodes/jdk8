package com.study.option;

import java.util.List;

/**
 * @ClassName Company
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 15:34
 **/
public class Company {
    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
