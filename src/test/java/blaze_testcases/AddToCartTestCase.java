package blaze_testcases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

public class AddToCartTestCase extends BlazeBaseSet {
	
	
@Test

public void addtoCartverify() throws  TimeoutException
{
	c.addPhone();
	c.alertphone();
c.checkcartPhone();
/*c.addLappy();
c.alertlap();
c.checkcartlap();
c.addMon();
c.alertmon();
c.checkcartmon();*/
}
}

