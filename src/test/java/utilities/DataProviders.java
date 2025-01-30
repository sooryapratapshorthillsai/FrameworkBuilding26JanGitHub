package utilities;



import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	// DataProvider 1
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
	    String path=".\\testData\\loginDataset.xlsx"; // taking xl file from testData

	    ExcelUtility xlutil=new ExcelUtility(path); // creating an object for XLUtility

	    int totalrows=xlutil.getRowCount("Sheet1");
	    int totalcols=xlutil.getCellCount("Sheet1",1);

	    String logindata[][]=new String[totalrows][totalcols]; // created a two-dimensional array which can store data

	    for(int i=1;i<=totalrows;i++) // read the data from xl storing in two-dimensional array
	    {
	        for(int j=0;j<totalcols;j++) // i is rows, j is cols
	        {
	            logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j); // storing cell data
	        }
	    }

	    return logindata; // returning two-dimensional array
	}
	}

