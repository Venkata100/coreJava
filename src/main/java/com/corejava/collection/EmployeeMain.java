package com.corejava.collection;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Log4j2
public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeMain employeeMain = new EmployeeMain();
        List<Employee> employees = employeeMain.employeeDetails();
//        employeeMain.iterateUsingLambda(employees);
        Collections.sort(employees);
        employeeMain.iterateUsingLambda(employees);

//        employeeMain.iterateUsingStream(employees);

//        Sort Using Comparator
//        ******************************
//        Collections.sort(employees, new EmployeeIdComparator());
//        employeeMain.iterateUsingLambda(employees);

//      Sort Using Comparator with Lambda
//        *********************************
        employees.sort(Comparator.comparing(data -> data.getEmpId()));
        //employees.sort(Comparator.comparing(Employee::getEmpId));

        Collections.sort(employees, (o1, o2) -> o2.getEmpId()-o1.getEmpId());

        employeeMain.iterateUsingLambda(employees);



    }

    public List<Employee> employeeDetails() {

        Employee employee1 = new Employee();
        employee1.setEmpId(6);
        employee1.setEmpName("Eswar");

        Employee employee2 = new Employee();
        employee2.setEmpId(2);
        employee2.setEmpName("Ram");

        Employee employee3 = new Employee();
        employee3.setEmpId(4);
        employee3.setEmpName("Sita");

        Employee employee4 = new Employee();
        employee4.setEmpId(3);
        employee4.setEmpName("Eswar");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);


        return list;
    }

    public void iterateUsingLambda(List<Employee>list) {
        if (CollectionUtils.isNotEmpty(list)) {
            list.forEach(employee -> log.info("EmployeeId:{} and EmployeeName:{}", employee.getEmpId(), employee.getEmpName()));
        }
    }
        public void iterateUsingStream(List<Employee>list){
            if (CollectionUtils.isNotEmpty(list)){
                list.stream().filter(employee -> "Eswar".equals(employee.getEmpName())).forEach(employee -> log.info("EmployeeId:{} and EmployeeName:{}", employee.getEmpId(),employee.getEmpName()));
            }

        }
}
