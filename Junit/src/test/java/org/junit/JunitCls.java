package org.junit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitCls {
	static WebDriver driver;
	
	@BeforeClass
	public static void TC06() {
		System.out.println("Before Class");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

	@Before
	public void TC02() throws IOException {
		System.out.println("Before");
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Luna\\Desktop\\megaa\\junitTC01.png");
		FileUtils.copyFile(srcFile, destFile);
	

	}

	@Test
	public void Tc01() throws InterruptedException {
		System.out.println("Test");
		driver.findElement(By.id("username")).sendKeys("megaainbox");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();


		WebElement ddLocation = driver.findElement(By.id("location"));
		Select select = new Select(ddLocation);
		select.selectByIndex(1);

		WebElement ddHotel = driver.findElement(By.id("hotels"));
		Select selectHotel = new Select(ddHotel);
		selectHotel.selectByIndex(1);

		WebElement ddRomeType = driver.findElement(By.id("room_type"));
		Select selectRomeType = new Select(ddRomeType);
		selectRomeType.selectByIndex(1);

		WebElement ddNumOfRoom = driver.findElement(By.id("room_nos"));
		Select selectNumOfRoom = new Select(ddNumOfRoom);
		selectNumOfRoom.selectByIndex(2);

		//datepick_in
		//driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("09/10/2023");
		
//		WebElement txtCheckOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//		txtCheckOut.clear();
//		txtCheckOut.sendKeys("09/10/2023");
//		Thread.sleep(3000);
		// adult_room
		WebElement ddAdultRoom = driver.findElement(By.id("adult_room"));
		Select selectAdultRoom = new Select(ddAdultRoom);
		selectAdultRoom.selectByIndex(1);
		
		WebElement ddChildRoom = driver.findElement(By.id("child_room"));
		Select selectChildRoom = new Select(ddChildRoom);
		selectChildRoom.selectByIndex(1);
		
		
		//input[@type='reset']
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();

		// first_name
		driver.findElement(By.id("first_name")).sendKeys("Megala");
		driver.findElement(By.id("last_name")).sendKeys("k");
		driver.findElement(By.id("address")).sendKeys("tamilNadu");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

		WebElement ddCreaditCard = driver.findElement(By.id("cc_type"));
		Select selectddCreaditCard = new Select(ddCreaditCard);
		selectddCreaditCard.selectByIndex(1);

		WebElement ddExpireDate = driver.findElement(By.id("cc_exp_month"));
		Select selectddExpireDate = new Select(ddExpireDate);
		selectddExpireDate.selectByIndex(1);

		// cc_exp_year
		WebElement ddExpireYear = driver.findElement(By.id("cc_exp_year"));
		Select selectddExpireYear = new Select(ddExpireYear);
		selectddExpireYear.selectByIndex(18);

		// cc_cvv
		driver.findElement(By.id("cc_cvv")).sendKeys("789");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		//oderId :order_no
		
		WebElement txtOderId = driver.findElement(By.id("order_no"));
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView()", txtOderId);
		String txtOderIdValue = txtOderId.getAttribute("value");
		System.out.println(txtOderIdValue);
		
	}

	@After
	public void TC04() throws IOException {
		System.out.println("After Class");

		TakesScreenshot screenShot=(TakesScreenshot) driver;
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Luna\\Desktop\\megaa\\junitTC02.png");
		FileUtils.copyFile(srcFile, destFile);
	}

	@AfterClass
	public static void TC05() {
		System.out.println("After");

	}
}