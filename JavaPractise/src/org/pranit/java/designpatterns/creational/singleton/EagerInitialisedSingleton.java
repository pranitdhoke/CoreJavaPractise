package org.pranit.java.designpatterns.creational.singleton;

public class EagerInitialisedSingleton {
	private static final EagerInitialisedSingleton instance = new EagerInitialisedSingleton();

	private EagerInitialisedSingleton() {
	}

	public static EagerInitialisedSingleton getInstance() {
		return instance;
	}

}