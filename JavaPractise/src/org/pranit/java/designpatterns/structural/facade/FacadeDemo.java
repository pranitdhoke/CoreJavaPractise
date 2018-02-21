/**
 * 
 */
package org.pranit.java.designpatterns.structural.facade;

import java.sql.Connection;

/**
 * @author pdhoke
 *
 */
public class FacadeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getConnection();
		DBHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getConnection();
		DBHelper oracleHelper = new OracleHelper();
		oracleHelper.generatePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.ReportType.PDF, tableName);

	}

}
