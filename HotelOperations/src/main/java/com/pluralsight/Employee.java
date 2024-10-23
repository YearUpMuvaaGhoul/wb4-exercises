package com.pluralsight;


public class Employee {
    private String employeeId;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(String employeeId, String employeeName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getemployeeName() {
        return employeeName;
    }

    public void setemployeeName(String name) {
        this.employeeName = name;
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

    // Calculating Regular and Overtime Hours with If Statements
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
 // Tertiary alternate code - return (hoursWorked > 40) ? 40 :hoursWorked;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
 //Tertiary alternate code - return (hoursWorked > 40) ? hoursWorked -40 : 0 ;
    }

    // Calculate Gross Pay (overtime or not, final pay)
    public double getGrossPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5; // Assuming overtime is paid at 1.5x rate
        return overtimePay + regularPay;

    }

}

//Explanation:

//Attributes:
//employeeId: Unique identifier for each employee.
//employeeName: The employee’s name.
//department: The department where the employee works.
//payRate: The hourly rate of pay.
//hoursWorked: Total hours worked by the employee.
//Constructor: Initializes the attributes when you create a new Employee object.

//Getters and Setters: Allow you to get and set the values of the attributes.
//
//Derived Getters: getTotalPay(): Calculates total pay as payRate multiplied by hoursWorked.
//getRegularHours(): Returns the hours worked up to a maximum of 40 hours (regular hours).
//getOvertimeHours(): Returns the hours worked beyond 40 hours (overtime hours).