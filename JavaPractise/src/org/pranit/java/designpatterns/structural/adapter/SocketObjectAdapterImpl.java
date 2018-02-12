/**
 * 
 */
package org.pranit.java.designpatterns.structural.adapter;

/**
 * @author Pranit Dhoke
 *
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
	
	private Socket socket = new Socket();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.adapter.SocketAdapter#get120Volt()
	 */
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.adapter.SocketAdapter#get12Volt()
	 */
	@Override
	public Volt get12Volt() {
		return convertVolt(socket.getVolt(), 10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.adapter.SocketAdapter#get3Volt()
	 */
	@Override
	public Volt get3Volt() {
		return convertVolt(socket.getVolt(), 40);
	}
	
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolt()/i);
	}

}
