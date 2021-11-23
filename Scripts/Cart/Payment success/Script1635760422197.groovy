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
import com.thoughtworks.selenium.webdriven.commands.SelectFrame as SelectFrame
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open browser'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'Call select get product'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Selected product'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter email address'
WebUI.setText(findTestObject('Cart Page/txt_email'), 'dong@test.com')

'Switch to iframe payment'
WebUI.switchToFrame(findTestObject('Men page/ifrm_payment'), 5)

'Enter credit number'
WebUI.setText(findTestObject('Cart Page/txt_cardNumber'), '4242 4242 4242 4242')

'Enter expiry date'
WebUI.setText(findTestObject('Cart Page/txt_date'), '02/22')

'Enter CVC number'
WebUI.setText(findTestObject('Cart Page/txt_cvcNumber'), '222')

'Enter zip code'
WebUI.setText(findTestObject('Cart Page/txt_zip'), '55555')

'Tab to "Pay With Credit Card" button'
WebUI.sendKeys(findTestObject('Cart Page/txt_zip'), Keys.chord(Keys.TAB))

'Press Enter key on keyboard'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'Verify message title successful'
WebUI.verifyElementText(findTestObject('Message/Payment/lbl_titlePaymentSuccess'), 'Success!')

'Verify message description successful'
WebUI.verifyElementText(findTestObject('Message/Payment/lbl_descriptionPaymentSuccess'), 'Your order has been processed, it will be delivered shortly.')

WebUI.closeBrowser()

