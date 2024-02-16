package ehub.com.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			Calendar calender = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			String location = System.getProperty("user.dir") + "\\src\\main\\Resources\\Reports\\" + "ExtentReport"
					+ "_" + formatter.format(calender.getTime()) + ".html";
			return createInstance(location);

		} else {
			return extent;
		}
	}

	public static ExtentReports createInstance(String fileName) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
		htmlReporter.config().setDocumentTitle(fileName);
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		//htmlReporter.config().setChartVisibilityOnOpen(true);
		
		htmlReporter.config().setEncoding("utf-8");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		return extent;
	}

}
