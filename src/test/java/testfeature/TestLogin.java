package testfeature;

import org.testng.annotations.Test;
import feature.Login;
import junit.framework.Assert;

public class TestLogin 
{
	public Login l1 = new Login();
	
	@Test
	public void testLogin_1()
	{
		boolean actualStatus = l1.login("admin", "admin");
		Assert.assertEquals(true, actualStatus);
	}
}
