import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Open browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Open and display list all products'
WebUI.navigateToUrl(GlobalVariable.G_URL)

'Check Shopping cart doesn\'t have item'
WebUI.verifyElementNotPresent(findTestObject('Home Page/lbl_numberCartItem'), 0)

'Click on Add to cart'
WebUI.click(findTestObject('Home Page/btn_addToCart'))

'Check cartcount present'
WebUI.verifyElementPresent(findTestObject('Home Page/lbl_numberCartItem'), 0)

productCount = WebUI.getText(findTestObject('Home Page/lbl_numberCartItem'), FailureHandling.STOP_ON_FAILURE)

'Verify number in cart count'
WebUI.verifyMatch(productCount, '1', false)

'Redirect to Shopping cart'
WebUI.click(findTestObject('Home Page/icon_shoppingCart'))

WebUI.closeBrowser()