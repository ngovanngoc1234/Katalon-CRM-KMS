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

'open brower'
WebUI.openBrowser('')

'navigate  to the url'
WebUI.navigateToUrl(GlobalVariable.URL_KMS)

'max size windowns'
WebUI.maximizeWindow()

'input user name to login'
WebUI.setText(findTestObject('loginpage/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    findTestData('AccountTest Data').getValue(1, 1))

'input pasword to login'
WebUI.setEncryptedText(findTestObject('loginpage/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

'click button login'
WebUI.click(findTestObject('loginpage/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_login-button'))

'verify login success'
WebUI.verifyElementText(findTestObject('loginpage/Page_Swag Labs/verify login'), 'PRODUCTS', FailureHandling.STOP_ON_FAILURE)

'close brower'
WebUI.closeBrowser()

