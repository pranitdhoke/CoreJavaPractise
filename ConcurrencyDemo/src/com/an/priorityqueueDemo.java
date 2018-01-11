package com.an;

import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class Employee implements Delayed {
	private int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	// @Override
	// public int compareTo(Employee o) {
	// if (o.id == this.id)
	// return 0;
	// if (o.id < this.id)
	// return 1;
	// else
	// return -1;
	// }

	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class priorityqueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// PriorityQueue<String> queue = new PriorityQueue<String>();
		// queue.add("D");
		// queue.add("A");
		// queue.add("B");
		// queue.add("E");
		//
		// System.out.println(queue);
		// queue.re
		// PriorityQueue<Employee> que = new PriorityQueue<Employee>();
		DelayQueue<Employee> que = new DelayQueue<Employee>();
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Employee emp3 = new Employee(8);
		Employee emp4 = new Employee(4);
		que.add(emp1);
		que.add(emp2);
		que.add(emp3);
		que.add(emp4);
		System.out.println(que);

	}
}
