/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public class RedColour implements Colour {

	/* (non-Javadoc)
	 * @see org.pranit.java.designpatterns.structural.bridge.Colour#applyColour()
	 */
	@Override
	public void applyColour() {
		System.out.println("Applying red colour");
	}

}
