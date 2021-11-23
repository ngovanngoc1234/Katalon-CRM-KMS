import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement as Keys

'Get webDriver'
WebDriver webDriver = DriverFactory.getWebDriver()

'Get list product add to cart'
List<String> listProductAddToCard = webDriver.findElements(By.xpath('(//button[@class=\'add\'])'))

'Get list price product'
List<String> listPriceProduct = webDriver.findElements(By.xpath('//div[@class="item"]/p[2]'))

int sumProduct = 0

println('size product ' + listProductAddToCard.size())

'Loop to get total price product cart'
for (int i = 0; i < listProductAddToCard.size(); i++) {
    //lấy text từ vị trí thứ n => cuối chuỗi
    String sub = listPriceProduct.get(i).getText().substring(1)

    //thay thế ký tự trong chuỗi bằng 1 khoảng tráng
    String textSub = sub.replace('.', '')

    //ép kiểu từ string sang số nguyên
    long priceSub = Long.parseLong(textSub)

    println('price ' + priceSub)

    sumProduct += priceSub

    listProductAddToCard.get(i).click()
}

println('price sum = ' + sumProduct)

WebUI.click(findTestObject('Home Page/icon_shoppingCart'))

