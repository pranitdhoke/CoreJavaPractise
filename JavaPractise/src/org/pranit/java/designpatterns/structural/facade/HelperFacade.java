/**
 * 
 */
package org.pranit.java.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * @author pdhoke
 *
 */
public class HelperFacade {

	public static void generateReport(DBType dbType, ReportType reportType, String tableName) {
		Connection con = null;
		DBHelper dbHelper = null;
		switch (dbType) {
		case MYSQL:
			con = MySqlHelper.getConnection();
			dbHelper = new MySqlHelper();
			switch (reportType) {
			case PDF:
				dbHelper.generatePDFReport(tableName, con);
				break;
			case HTML:
				dbHelper.generateHTMLReport(tableName, con);
				break;
			}
			break;
		case ORACLE:
			con = MySqlHelper.getConnection();
			dbHelper = new OracleHelper();
			switch (reportType) {
			case PDF:
				dbHelper.generatePDFReport(tableName, con);
				break;
			case HTML:
				dbHelper.generateHTMLReport(tableName, con);
				break;
			}
			break;
		}
	}

	public static enum DBType {
		MYSQL, ORACLE;
	}

	public static enum ReportType {
		PDF, HTML;
	}
}
