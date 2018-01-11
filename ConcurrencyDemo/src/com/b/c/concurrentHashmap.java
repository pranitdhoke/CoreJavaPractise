package com.b.c;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>(
				65, 0.75F, 63);
		LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();
		map1.put("a1", "a1");
		map1.put("a2", "a2");
		map1.put("a3", "a3");
		

	}

}
