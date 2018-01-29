/**
 * 
 */
package org.pranit.java.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author Pranit Dhoke
 *
 */
public class TestSerializationSingleton {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton obj1 = SerializedSingleton.getInstance();

		ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("singletonSerialized.txt"));
		objectOutput.writeObject(obj1);
		objectOutput.close();

		ObjectInput objectInput = new ObjectInputStream(new FileInputStream("singletonSerialized.txt"));
		SerializedSingleton obj2 = (SerializedSingleton) objectInput.readObject();
		objectInput.close();

		System.out.println("Hashcode of obj1 is:" + obj1.hashCode());
		System.out.println("Hashcode of obj2 is:" + obj2.hashCode());

	}

}
