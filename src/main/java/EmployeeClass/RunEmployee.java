package EmployeeClass;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * RunEmployee.java 04/02/2024
 *
 * @author Thabiso Mbatha
 */
public class RunEmployee {

    public static void main(String[] args) {

        //Default constructor Employee object
        JOptionPane.showMessageDialog(null, "Default Constructor employee");
        //System.out.println("Default Constructor employee");
        Employee emp1 = new Employee();

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Employee Name: ");
        String inputName;

        inputName = JOptionPane.showInputDialog("Enter Employee Name: ");
        emp1.setEmpName(inputName);

        //System.out.println("Enter Employee Surname: ");
        inputName = JOptionPane.showInputDialog("Enter Employee Surname: ");
        emp1.setEmpSurname(inputName);

        //System.out.println("Enter Employee Number: ");
        inputName = JOptionPane.showInputDialog("Enter Employee Number: ");
        emp1.setEmpNumber(inputName);

        System.out.println("Enter Employee Salary: ");
        inputName = JOptionPane.showInputDialog("Enter Employee Salary: ");

        double convertedDouble = Double.parseDouble(inputName);
        emp1.setEmpSalary(convertedDouble);

        System.out.println(emp1.toString());
        JOptionPane.showMessageDialog(null, emp1.toString());

        //Overloaded constructor employee object
        //System.out.println("Overloaded Constructor employee");
        JOptionPane.showMessageDialog(null, "Overloaded COnstruictor Employee");

        Employee emp2;
        String name, surname, number;
        double salary;

        //System.out.println("Enter Employee Name: ");
        //name = scanner.next();
        name = JOptionPane.showInputDialog("Enter Employee Name: ");

        //System.out.println("Enter Employee Surname: ");
        //surname = scanner.next();
        surname = JOptionPane.showInputDialog("Enter Employee Surname: ");

        //System.out.println("Enter Employee Number: ");
        //number = scanner.next();
        number = JOptionPane.showInputDialog("Enter EMployee Number: ");

        //System.out.println("Enter Employee Salary: ");
        //salary = scanner.nextDouble();
        String tempSalary = JOptionPane.showInputDialog("Enter EMployee Salary: ");
        salary = Double.parseDouble(tempSalary);
        
        emp2 = new Employee(name, surname, number, salary);

        System.out.println(emp2.toString());
        JOptionPane.showMessageDialog(null, emp2.toString());

        //Salary Increase
        //System.out.println("Salary Increase");
        JOptionPane.showMessageDialog(null, "Salary Increase");
        
        //System.out.println("Enter Percentage increase for the employees: ");
        //double percentageIncrease = scanner.nextDouble();
        
        String tempPercentageIncrease = JOptionPane.showInputDialog("Enter Percentage Increase: ");
        double percentageIncrease = Double.parseDouble(tempPercentageIncrease);
        
        emp1.increaseSalary(percentageIncrease);
        emp2.increaseSalary(percentageIncrease);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        
        JOptionPane.showMessageDialog(null, emp1.toString());
        JOptionPane.showMessageDialog(null, emp2.toString());
    }
}
