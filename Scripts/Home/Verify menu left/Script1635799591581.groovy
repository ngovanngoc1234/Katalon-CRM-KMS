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
WebUI.callTestCase(findTestCase('Sub-Test Cases/Navigate to website'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify label Highest Price'
WebUI.verifyElementVisible(findTestObject('Home Page/Menu Left/lbl_Highest Price'), FailureHandling.STOP_ON_FAILURE)

'Verify fiter price'
WebUI.verifyElementVisible(findTestObject('Home Page/Menu Left/input_filter price'), FailureHandling.STOP_ON_FAILURE)

'Verify fiter Only Show Sale Items'
WebUI.verifyElementText(findTestObject('Home Page/Menu Left/lbl_Only Show Sale Items'), 'Only Show Sale Items')

'Verify button Sale'
WebUI.verifyElementVisible(findTestObject('Home Page/Menu Left/btn_filter sale'), FailureHandling.STOP_ON_FAILURE)

'Verify text Special Sale'
WebUI.verifyElementText(findTestObject('Home Page/Menu Left/lbl_Special Sale'), 'Special Sale!')

'Verify text Shop now because half our items are greatly reduced'
WebUI.verifyElementText(findTestObject('Home Page/Menu Left/lbl_sub Special Sale'), 'Shop now because half our items are greatly reduced')

'Verify text contact Us'
WebUI.verifyElementText(findTestObject('Home Page/Menu Left/lbl_sub Contact Us'), 'Contact Us')

'Verify text Questions? Call us at 1-800-DEMO-SHOP, we\'re happy to be of service.'
WebUI.verifyElementText(findTestObject('Home Page/Menu Left/lbl_sub Contact Us'), 'Questions? Call us at 1-800-DEMO-SHOP, we\'re happy to be of service.')

WebUI.closeBrowser()

