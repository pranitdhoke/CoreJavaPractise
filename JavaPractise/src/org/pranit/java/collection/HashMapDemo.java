package org.pranit.java.collection;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;

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
	public int hashCode() {
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		for(int i=1;i<=15;i++) {
			map.put(new Employee(i), i);
		}
		
		System.out.println(map);

	}

}
