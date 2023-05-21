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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.myinterviewpractice.com/')

WebUI.click(findTestObject('Page_Mock Interview Practice Online at My I_22d11d/button_Menu'))

WebUI.click(findTestObject('Page_Mock Interview Practice Online at My I_22d11d/p_Pricing'))

WebUI.click(findTestObject('Page_Pricing  My Interview Practice/button_Choose Plus'))

WebUI.setText(findTestObject('Page_My Interview Practice/input_Email_email'), 'test12255@mailinator.com')

WebUI.setText(findTestObject('Page_My Interview Practice/input_Full Name_name'), 'Test')

WebUI.setEncryptedText(findTestObject('Page_My Interview Practice/input_Password_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Page_My Interview Practice/button_Selected'))

WebUI.click(findTestObject('Page_My Interview Practice/a_Checkout with'))

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_US_login_email'), 'sb-47ai6e451036@personal.example.com')

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Next'))

WebUI.setEncryptedText(findTestObject('Page_Log in to your PayPal account/input_Next_login_password'), '6wK4OR+OHaCQJZCe8WSFlA==')

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Log In'))

WebUI.setEncryptedText(findTestObject('Page_Log in to your PayPal account/input_Next_login_password'), '6wK4OR+OHaCQJZCe8WSFlA==')

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Show'))

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_Next_login_password_1'), 'wu]4<K/:')

WebUI.click(findTestObject('Object Repository/Temp/Page_PayPal Checkout/button_Complete Purchase'))

WebUI.click(findTestObject('Object Repository/Temp/Page_PayPal Checkout/a_click here'))

WebUI.click(findTestObject('Page_Mock Interview Practice Online at My I_22d11d/a_Start Practicing'))

WebUI.closeBrowser()

