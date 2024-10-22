package com.pluralsight;


   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Gather employee details from user
            System.out.print("Enter Employee ID: ");
            String employeeId = scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Pay Rate (per hour): ");
            double payRate = scanner.nextDouble();

            System.out.print("Enter Hours Worked: ");
            double hoursWorked = scanner.nextDouble();

            // Create Employee object with user inputs
            Employee employee = new Employee(employeeId, name, department, payRate, hoursWorked);

            // Output Employee details and calculated gross pay
            System.out.println("ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getemployeeName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Pay Rate: $" + employee.getPayRate());
            System.out.println("Hours Worked: " + employee.getHoursWorked());
            System.out.println("Regular Hours: " + employee.getRegularHours());
            System.out.println("Overtime Hours: " + employee.getOvertimeHours());
            System.out.println("--------------------------------------------");
            System.out.println("Gross Pay: $" + employee.getGrossPay());


        }
    }