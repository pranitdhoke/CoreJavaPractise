package org.pranit.java.designpatterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employees  =new Employees();
		employees.loadData();
		
		Employees employees1 = (Employees) employees.clone();
		Employees employees2 = (Employees) employees.clone();
		
		List list = employees1.getEmployees();
		list.add("Shyam");
		
		List list1 = employees2.getEmployees();
		
		list1.remove("Jyoti");
		
		System.out.println("Employees list: " + employees.getEmployees());
		System.out.println("Employee1 list: " + list);
		System.out.println("Employee2 list: " + list1);

	}

}
