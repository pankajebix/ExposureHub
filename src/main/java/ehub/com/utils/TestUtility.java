package ehub.com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;

public class TestUtility {

	public static void setdateForLog4j() {
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		System.setProperty("current_date", formater.format(new Date()));
		PropertyConfigurator
				.configure(System.getProperty("user.dir") + PropertyUtility.getProperty("pathOfLog4JPropertyFile"));
	}

	public static void main(String[] args) {
		TestUtility.setdateForLog4j();
	}
}
