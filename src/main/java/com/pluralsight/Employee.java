package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Employee {
    static Scanner myScanner = new Scanner(System.in);
    static LocalDateTime timeNow = LocalDateTime.now();
    static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double totalHours;
    private double regularsHours;
    private double overtimeHours;
    private double punchIn;
    private double punchOut;


    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked, double totalPay, double totalHours, double regularsHours, double overtimeHours, double punchIn, double punchOut) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.totalHours = totalHours;
        this.regularsHours = regularsHours;
        this.overtimeHours = overtimeHours;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }

    public static void punchTimeCard() {
        System.out.println("""
                Please choose one of the following.
                1) Check In
                2) Check Out
                """);
        String userChoice = myScanner.nextLine();
        switch (userChoice) {
            case "1":
                System.out.println("Welcome " + timeFormat.format(timeNow));
                break;
            case "2":
                System.out.println("Goodbye " + timeFormat.format(timeNow));
            default:
                System.out.println("Choose 1 or 2 ");

        }


    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (overtimeHours < 0) {
            return regularsHours * payRate;
        } else {
            return (regularsHours * payRate) + (overtimeHours * payRate * 1.5);
        }
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getTotalHours() {
        return regularsHours + overtimeHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getRegularsHours() {
        return regularsHours;
    }

    public void setRegularsHours(double regularsHours) {
        this.regularsHours = regularsHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
