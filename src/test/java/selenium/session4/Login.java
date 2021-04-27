package selenium.session4;


import utilities.SeleniumUtils;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtils.openApplication("chrome", "https://opensource-demo.orangehrmlive.com");
		
		String user = "Admin";
		String pass = "admin123";
		
		SeleniumUtils.typeOn("id=txtUsername",user);
		SeleniumUtils.typeOn("css=#txtPassword",pass);
		SeleniumUtils.clickOn("css=input[name='Submit']");
		SeleniumUtils.clickOn("partialLinkText=Welcome");
		
		Thread.sleep(3000);
	
		}

}
