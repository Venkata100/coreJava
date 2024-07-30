package com.corejava.variable.oops.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        PrintReport printReport = new PrintReport();
        Report Apac = new Apac();
        Report Emea = new Emea();
        Report NorthAmerica = new NorthAmerica();
        Report Latam = new Latam();

        printReport.printReports(Apac);
        printReport.printReports(Emea);
        printReport.printReports(NorthAmerica);
        printReport.printReports(Latam);






    }
}
