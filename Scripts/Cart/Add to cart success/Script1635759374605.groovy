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
import org.openqa.selenium.Keys as Keys

'Call open browser'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'Get text name product'
product_Name = WebUI.getText(findTestObject('Home Page/lbl_productName'))

'Get price product'
product_Price = WebUI.getText(findTestObject('Home Page/lbl_productPrice'))

'Click add to cart'
WebUI.click(findTestObject('Home Page/btn_addToCart'))

'Verify number cart item'
WebUI.verifyElementVisible(findTestObject('Home Page/lbl_numberCartItem'))

'Click icon shopping cart'
WebUI.click(findTestObject('Home Page/icon_shoppingCart'))

'Verify name product on name product cart'
WebUI.verifyElementText(findTestObject('Cart Page/lbl_productName_CartPage'), product_Name, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

