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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.server.handler.FindElement as FindElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Open login'
WebUI.callTestCase(findTestCase('Test Case Womens Tab/Sub payment successfully'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

'Click only show Sale item'
WebUI.click(findTestObject('Women tab/lbl_click_tag'))

'Get WebDriver on browser'
WebDriver driver = DriverFactory.getWebDriver()

'Get list product on page'
List<String> element = driver.findElements(By.xpath(GlobalVariable.count_item))

'Get total product on page'
total_element = element.size()

WebUI.comment('Total product name: ' + total_element)

TestData list_product = findTestData(GlobalVariable.list_product_sale)

if (list_product.rowNumbers == total_element) {
    for (int count = 1; count <= list_product.rowNumbers; count++) {
        product_sale = WebUI.getText(findTestObject('Object Repository/Women tab/tag_salepill', [('count') : count]))

        WebUI.comment('Product Name: ' + product_sale)

        WebUI.verifyMatch(product_sale, 'SALE', false, FailureHandling.STOP_ON_FAILURE)

        product_name = WebUI.getText(findTestObject('Object Repository/Women tab/txt_item_variable', [('count') : count]))

        //WebUI.comment('Product Name: ' + product_name)
        product_name_expec = list_product.getValue(1, count)

        //WebUI.comment('Product Name Expected: ' + product_name_expec)
        WebUI.verifyMatch(product_name[count], product_name_expec[count], false, FailureHandling.STOP_ON_FAILURE)

        product_price = WebUI.getText(findTestObject('Object Repository/Women tab/txt_item_price_variable', [('count') : count]))

        //WebUI.comment('Product Price: ' + product_price)
        product_price_expec = list_product.getValue(2, count)

        //WebUI.comment('Product Price Expected: ' + product_price_expec)
        WebUI.verifyMatch(product_price[(count - 1)], product_price_expec[(count - 1)], false, FailureHandling.STOP_ON_FAILURE)
    }
} else {
    WebUI.comment(' Actual not math expected ')
}

WebUI.closeBrowser()

