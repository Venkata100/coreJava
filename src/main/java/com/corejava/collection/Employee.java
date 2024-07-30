package com.corejava.collection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;

    @Override
    public int compareTo(Employee employee) {
        return  this.getEmpName().compareTo(employee.getEmpName());
    }


}
