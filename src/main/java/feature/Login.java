package feature;

public class Login
{
	public boolean login_status;
	public boolean login(String username, String password)
	{
		if (username.equals("admin")&&(password.equals("admin")))
		{
			System.out.println("--Login Success--");
			login_status = true;
			return login_status;
		}
		else
		{
			System.out.println("--Login Failed--");
			login_status = false;
			return login_status;
		}
	}
}
