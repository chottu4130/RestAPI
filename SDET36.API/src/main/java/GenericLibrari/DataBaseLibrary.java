package GenericLibrari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * @author NIKHIL RAJ
 *
 */

public class DataBaseLibrary 
{
	Driver driverRef;
	Connection con=null;
	
	/**
	 * this method will establish the connection with mysql db
	 * @throws SQLException
	 */
	
	public void connectDB() throws SQLException
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection(IConstants.dbURI,IConstants.dbUserName,IConstants.dbPassword);
	}
	
	/**
	 * this method will close db connaction
	 * @throws SQLException
	 */
	
	public void closeDB() throws SQLException
	{
		con.close();
	}

	/**
	 * this method will execute the query and return the value if the validation is done
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	
	
	public String readDataFormDBAndValidate(String query,int columnIndex,String expData) throws SQLException
	{
		

		boolean flag =false;
		
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
				
			{
				flag =true;
				break;
			}
			
		}
		
		if(flag)
			
		{
			System.out.println("data verfied");
			return expData;
		}
		else
		{
			System.out.println("data not verified");
			return "";
		}
		
		
			
		
		
		
		
		
		
	}

}
