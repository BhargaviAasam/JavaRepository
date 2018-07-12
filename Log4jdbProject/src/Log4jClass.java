import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.sql.*;
import java.io.*;


public class Log4jClass {
	
	
	   static Logger log = Logger.getLogger(Log4jClass.class);
	   
	   public static void main(String[] args)throws IOException,SQLException{
		   BasicConfigurator.configure();
	      log.debug("Debug");
	      log.info("Info");
	   }
	}
	
	
	
		


