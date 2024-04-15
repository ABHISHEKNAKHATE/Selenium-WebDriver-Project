package Projects;	
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Project {
			    public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\OneDrive\\Desktop\\Selenium Jar\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				//URL Access
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				
				//Maximize Window 
				driver.manage().window().maximize();
				
				//Login
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(3000);
				
				//Navigate to addEmployee Page
		 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		 		Thread.sleep(3000);
		 		
		 		//Add Employee
		 		driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		 		driver.findElement(By.name("lastName")).sendKeys("Nakhate");
		 		Thread.sleep(3000);
		 		
		 		//Save the Employee
		 		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		 		System.out.println("Add Succesfully!!!");
		 		Thread.sleep(1000);
		 		
		 		//Logout
		 		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		 		Thread.sleep(2000);
		 		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		 		Thread.sleep(1000);
		 		driver.close();
			}
	}

