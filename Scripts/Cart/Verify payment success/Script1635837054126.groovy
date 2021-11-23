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

'Open browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Open and display list all products'
WebUI.navigateToUrl(GlobalVariable.G_URL)

'Click on Add to cart'
WebUI.click(findTestObject('Home Page/btn_addToCart'))

'Redirect to Shopping cart'
WebUI.click(findTestObject('Home Page/icon_shoppingCart'))

CustomKeywords.'webui.customPayment.paymentWithCard'(email, cardnumber, expdate, cvc, zip)

'Verify present icon success'
WebUI.verifyElementPresent(findTestObject('Cart Page/icon_paymentSuccess'), 0)

'Verify present label success'
WebUI.verifyElementText(findTestObject('Cart Page/lbl_success'), lblsuccess)

'Verify present description success'
WebUI.verifyElementText(findTestObject('Cart Page/lbl_successDescription'), lblsuccessdesc)

WebUI.closeBrowser()

