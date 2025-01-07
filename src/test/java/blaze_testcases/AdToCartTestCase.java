package blaze_testcases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

public class AdToCartTestCase extends BlazeBaseSet {
	
	
@Test

public void addtoCartverify1() throws  TimeoutException
{
	cp.addPhone();
	cp.alertphone();
cp.checkcartPhone();
}
}