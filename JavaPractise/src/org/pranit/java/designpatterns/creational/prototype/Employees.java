package org.pranit.java.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Employees class is used to demo Prototype Pattern. To demo prototype we need
 * to implement Cloneable interface
 * 
 * @author Pranit Dhoke
 *
 */
public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		this.empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Raj");
		empList.add("Mugdha");
		empList.add("Jyoti");
		empList.add("Sameer");
	}

	public List<String> getEmployees() {
		return empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmployees()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
