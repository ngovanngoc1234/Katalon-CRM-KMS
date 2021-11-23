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

'call function open browser'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'call function select product'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Selected product'), [:], FailureHandling.STOP_ON_FAILURE)

'enter email to textbox email'
WebUI.setText(findTestObject('Cart Page/txt_email'), email)

'switch to frame information card payment'
WebUI.switchToFrame(findTestObject('Cart Page/fra_payment'), 60)

'enter card number'
WebUI.setText(findTestObject('Cart Page/txt_cardNumber'), card_number)

'enter expriration date of card'
WebUI.setText(findTestObject('Cart Page/txt_date'), Expiration_date)

'enter cvc number of card'
WebUI.setText(findTestObject('Cart Page/txt_cvcNumber'), CVC)

'enter zipcode '
WebUI.setText(findTestObject('Cart Page/txt_zip'), ZIP)

'verify payment fail'
WebUI.verifyElementVisible(findTestObject('Message/Payment/img_CardumberInvaild'))

'close browser'
WebUI.closeBrowser()

