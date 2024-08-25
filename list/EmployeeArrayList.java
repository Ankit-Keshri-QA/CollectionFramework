package list;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + " \n";
	}

}

public class EmployeeArrayList {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101,"David Warner",114000.89));
		employees.add(new Employee(102,"Mitch Marsh",145500.50));
		employees.add(new Employee(103,"Steve Smith",122800.81));
		employees.add(new Employee(104,"Travis Head",105670.00));
		
		// Print
		System.out.println(employees);
		System.out.println();
		
		// List of Employess
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		// Get an employee
		Employee maxwell = employees.get(0);
		System.out.println(maxwell);
		
		// Updating salary of an employee
        maxwell.setSalary(65000);
        System.out.println("Updated salary of employee at index 1: " + maxwell);

        // Removing an employee
        employees.remove(0);
        System.out.println("\nAfter removing employee at index 0:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Checking if the list contains a specific employee (by reference)
        boolean containsJohn = employees.contains(new Employee(105,"John Doe", 50000)); // false because it's a new object
        System.out.println("\nDoes the list contain John Doe? " + containsJohn);

        // Checking if the list is empty
        boolean isEmpty = employees.isEmpty();
        System.out.println("Is the employee list empty? " + isEmpty);

        // Clearing the employee list
        employees.clear();
        System.out.println("Employee list cleared.");
        System.out.println("Is the employee list empty now? " + employees.isEmpty());
		
	}

}
