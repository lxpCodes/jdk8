package com.study.option;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName OptionTest2
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 15:35
 **/
public class OptionTest2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("liangxp");

        Employee employee2 = new Employee();
        employee2.setName("huhl");

        Company company = new Company();
        company.setName("IFeng");

        List<Employee> employeeList = Arrays.asList(employee1,employee2);
        company.setEmployees(employeeList);

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(company1 -> company1.getEmployees()).orElse(Collections.emptyList()));
        System.out.println(optional.map(Company::getEmployees).orElse(Collections.emptyList()));


    }
}
