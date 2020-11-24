package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProReader {
	public static String getLocator(String key)
	{
		String loc="";
		File pfile= new File("E:\\Sep-batch\\MavenPOM\\src\\main\\resources\\Object.properties");
		try {
			FileInputStream fis = new FileInputStream(pfile);
			Properties pro = new Properties();
			
			pro.load(fis);
			
		loc=	pro.getProperty(key);
		
		
		
		return loc;
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loc;
	}

}
