package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.reader.ReaderException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends baseClass{
@Test(dataProvider = "sendData")
	public void createlead(String cname, String fName, String lName) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData() throws Throwable{
	ReadExcel re = new ReadExcel();
String[][] readData = re.readData();
return readData;
}
}






