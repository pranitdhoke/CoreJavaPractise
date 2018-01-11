package com.b.c;

import java.util.Comparator;
import java.util.PriorityQueue;

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.id == o2.id)
			return 0;
		if (o1.id > o2.id)
			return 1;
		else
			return -1;
	}

}

class Employee {
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

}

public class Priorityqueue {

	public Priorityqueue() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PriorityQueue<Employee> queue = new PriorityQueue<Employee>(20,
				new EmployeeComparator());
		queue.add(new Employee(3));
		queue.add(new Employee(5));
		queue.add(new Employee(1));
		queue.add(new Employee(2));
		queue.add(new Employee(4));
		System.out.println(queue);

		// queue.add("D");
		// queue.add("A");
		// queue.add("C");
		// queue.add("B");
		// System.out.println(queue);
		// queue.remove("A");
		System.out.println(queue);

	}
}
