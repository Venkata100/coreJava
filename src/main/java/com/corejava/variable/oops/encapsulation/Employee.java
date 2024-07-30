package com.corejava.variable.oops.encapsulation;

public class Employee {
    private int Emp_ID;
    private String Name;
    private long phoneNo;
    private String Email;

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        Emp_ID = emp_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {

            throw new IllegalArgumentException("name cannot be null or empty!");

        }
        Name = name;
    }

    public long getPhoneNo(long l) {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {

        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
