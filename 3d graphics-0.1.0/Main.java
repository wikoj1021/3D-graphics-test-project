import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import window.EventGet;
import window.Window;

public class Main {
	
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date date = new Date();
		
		final String FILE_PATH  = "log_"+dateFormat.format(date)+".txt";
		
		System.out.println(FILE_PATH);
		File log = new File(FILE_PATH);
		FileWriter writeLog;
		try{
			log.createNewFile();
			writeLog = new FileWriter(log);
			writeLog.write("test");
			writeLog.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		EventGet window = new EventGet();
		
	}

}
