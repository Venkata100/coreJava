package com.corejava.variable.oops.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmp_ID(10);
        employee.setName("Eswar");
        log.info("Emp_ID :{}, Name :{}",employee.getEmp_ID(),employee.getName());

        Employee employee1 = new Employee();
        employee1.setPhoneNo(12345670L);
        employee1.setEmail("abc@123.com");
        log.info("Emp_ID :{}, Name :{}", employee1.getPhoneNo(12345679l) ,employee1.getEmail());

    }
}
