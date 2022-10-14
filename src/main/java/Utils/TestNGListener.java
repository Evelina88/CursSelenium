package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++++++");
		Log.info("+++++ Start method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time : " + timeStamp);
		Log.info("++++++++++++++++++++++++++++++++++");
		
	}

	public void onTestSuccess(ITestResult result) {
		Log.info("++++++++++++++++++++++++++++++++++");
		Log.info("+++++ Passed method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Strat time : " + timeStamp);
		Log.info("++++++++++++++++++++++++++++++++++");
	}

	public void onTestFailure(ITestResult result) {
		Log.error("++++++++++++++++++++++++++++++++++");
		Log.error("+++++ Failed method :" + result.getName());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.error("fail time : " + timeStamp);
		Log.error("++++++++++++++++++++++++++++++++++");
		Log.error(result.getThrowable());
		
	}
	
	

}
