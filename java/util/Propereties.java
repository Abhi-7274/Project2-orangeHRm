package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Propereties {
      
	public static Properties getProperty() throws IOException
	{
		FileInputStream fp = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\OrangeHRM\\src\\test\\java\\properties\\testcase.properties");
		Properties prop = new Properties();
		prop.load(fp);
		return prop;
		
	}
	  
	public static String url() throws IOException {
		
		return getProperty().getProperty("url");
			
	} 
	
	public static String username() throws IOException	{
	
		return getProperty().getProperty("username");
		
	}
	public static String password() throws IOException {
		
		return getProperty().getProperty("password");
		
	}
    public static String xpath() throws IOException {
		
		return getProperty().getProperty("Loginxpath");
		
	}
    public static String username2() throws IOException	{
		
		return getProperty().getProperty("username2");
		
	}
    public static String password2() throws IOException {
		
		return getProperty().getProperty("password2");
		
	}
   public static String username3() throws IOException	{
		
		return getProperty().getProperty("username3");
   }
   public static String password3() throws IOException {
		
		return getProperty().getProperty("password3");
		
	}
   public static String username4() throws IOException	{
		
		return getProperty().getProperty("username4");
  }
   public static String password4() throws IOException {
		
		return getProperty().getProperty("password4");
  }
   public static String url1() throws IOException {
		
		return getProperty().getProperty("url1");
			
		} 

 public static String xpath2() throws IOException {
	
	return getProperty().getProperty("EmployeeNamexpath");
	
  }
 public static String EmployeeName() throws IOException	{
		
		return getProperty().getProperty("EmployeeName");
  }
  public static String xpath3() throws IOException {
		
		return getProperty().getProperty("Jobtitlexpath");
  }
  public static String Jobtitle() throws IOException	{
		
		return getProperty().getProperty("Jobtitle");

 }
  public static String xpath4() throws IOException {
		
		return getProperty().getProperty("profilexpath");
 }
  public static String url2() throws IOException {
		
		return getProperty().getProperty("url2");
			
		} 
  public static String xpath5() throws IOException {
		
		return getProperty().getProperty("timesheetemployeexpath");
}
  public static String EmployeeName1() throws IOException	{
		
		return getProperty().getProperty("EmployeeNametimesheet");
		
  }
  public static String xpath6() throws IOException {
		
		return getProperty().getProperty("viewxpath");

 }
}

