/**
 * 
 */
package org.pranit.java.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * @author pdhoke
 *
 */
public class OracleHelper implements DBHelper {

	public static Connection getConnection(){
		System.out.println("Getting Oracle connection...");
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.pranit.java.designpatterns.structural.facade.DBHelper#generatePDFReport(java.lang.String, java.sql.Connection)
	 */
	@Override
	public void generatePDFReport(String table, Connection connection) {
		System.out.println("Generating Oracle PDF report ");
	}

	/* (non-Javadoc)
	 * @see org.pranit.java.designpatterns.structural.facade.DBHelper#generateHTMLReport(java.lang.String, java.sql.Connection)
	 */
	@Override
	public void generateHTMLReport(String table, Connection connection) {
		System.out.println("Generating Oracle PDF report ");
	}

}
