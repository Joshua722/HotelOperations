package com.pluralsight;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Employee {
    static Scanner myScanner = new Scanner(System.in);
    static LocalDateTime timeNow = LocalDateTime.now();
    static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm:a");
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double totalHours;
    private double regularsHours;
    private double overtimeHours;
    private LocalDateTime punchIn;
    private LocalDateTime punchOut;


    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked, double totalPay,
                    double totalHours, double regularsHours, double overtimeHours) {
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

    public Employee(long employeeId, String name, String department, double payRate) {
    }

    public void punchIn(LocalDateTime time) {
        punchIn = time;
    }

    public void punchIn() {
        this.punchIn = punchIn;
    }

    public void punchOut(LocalDateTime time) {
        punchOut = time;
    }

    public void punchOut() {
        this.punchOut = punchOut;
    }

    public void punchTimeCard() {
        if (punchIn != null && punchOut != null) {
            Duration duration = Duration.between(punchIn, punchOut);
            hoursWorked = (double) duration.toMinutes() / 60;

        } else {
            hoursWorked = 0;
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
            return hoursWorked * payRate;
        } else {
            return (hoursWorked * payRate) + (overtimeHours * payRate * 1.5);
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
