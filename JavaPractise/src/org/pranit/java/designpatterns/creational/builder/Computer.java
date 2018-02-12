package org.pranit.java.designpatterns.creational.builder;

/**
 * Builder pattern demo class
 * 
 * @author Pranit Dhoke
 *
 */
public class Computer {
	/* Required fields */
	private String hdd;
	private String ram;
	/* Optional fields */
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	/**
	 * @return the hdd
	 */
	public String getHdd() {
		return hdd;
	}

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @return the isGraphicsCardEnabled
	 */
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	/**
	 * @return the isBluetoothEnabled
	 */
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public Computer(ComputerBuilder computerBuilder) {
		hdd = computerBuilder.hdd;
		ram = computerBuilder.ram;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	public static class ComputerBuilder {
		/* Required fields */
		private String hdd;
		private String ram;
		/* Optional fields */
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		/**
		 * @param isGraphicsCardEnabled
		 *            the isGraphicsCardEnabled to set
		 */
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		/**
		 * @param isBluetoothEnabled
		 *            the isBluetoothEnabled to set
		 */
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
