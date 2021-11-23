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

'Open browser, navigate to website'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on "Men\'s" tab on menu header'
WebUI.click(findTestObject('Men page/lbl_men'))

'Click on "Add to cart" button of the first product'
WebUI.click(findTestObject('Men page/btn_addToCart'))

'Click on "Add to cart" button of the second product'
WebUI.click(findTestObject('Men page/btn_addToCart_1'))

'Verify the number on "Cart" icon'
WebUI.verifyElementVisible(findTestObject('Home Page/lbl_numberCartItem'))

'Navigate to "cart" page'
WebUI.click(findTestObject('Men page/icon_shoppingCart'))

WebUI.closeBrowser()

