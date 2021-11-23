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

'Add to cart success from Men page'
WebUI.callTestCase(findTestCase('Sub-Test Cases/Selected products _Men page'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter an valid email'
WebUI.setText(findTestObject('Cart Page/txt_email'), 'huongact96@gmail.com')

'Waiting for iframe_payment'
WebUI.switchToFrame(findTestObject('Men page/ifrm_payment'), 5)

'Enter card number '
WebUI.setText(findTestObject('Cart Page/txt_cardNumber'), '4242 4242 4242 4242')

'Enter expiration date'
WebUI.setText(findTestObject('Cart Page/txt_date'), '12/24')

'Enter cvc number'
WebUI.setText(findTestObject('Cart Page/txt_cvcNumber'), '123')

'Enter zip code'
WebUI.setText(findTestObject('Cart Page/txt_zip'), '12345')

'Exit the Frame'
WebUI.switchToDefaultContent()

'Click on "PAY WITH CREDIT CARD" button'
WebUI.click(findTestObject('Men page/btn_payment'))

