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

'Open browser anh login web'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'Get text menu'
menubar = WebUI.getText(findTestObject('Home Page/menuBar'))

WebUI.comment(menubar)

'Verify logo'
WebUI.verifyElementVisible(findTestObject('Home Page/logo'))

'Verify text lable Women'
WebUI.verifyElementText(findTestObject('Home Page/lbl_women'), 'Women\'s')

'Verify text lable Men\'s'
WebUI.verifyElementText(findTestObject('Home Page/lbl_men'), 'Men\'s')

'Verify text lable Sale'
WebUI.verifyElementText(findTestObject('Home Page/lbl_sale'), 'Sale')

'Verify icon shopping cart'
WebUI.verifyElementVisible(findTestObject('Home Page/icon_shoppingCart'))

WebUI.closeBrowser()

