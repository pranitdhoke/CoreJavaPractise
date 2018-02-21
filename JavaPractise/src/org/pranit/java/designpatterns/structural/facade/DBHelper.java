/**
 * 
 */
package org.pranit.java.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * @author pdhoke
 *
 */
public interface DBHelper {

	void generatePDFReport(String table, Connection connection);

	void generateHTMLReport(String table, Connection connection);

}
