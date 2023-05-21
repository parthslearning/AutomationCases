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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('OverflowMenu/Btn_OverFlow'))

WebUI.click(findTestObject('OverflowMenu/Pricing'))

WebUI.click(findTestObject('Pricing/Btn_BookDemo'))

WebUI.verifyTextPresent('Book a Demo', false)

WebUI.delay(10)

WebUI.click(findTestObject('BookDemo/btn_SubmitDemoRequest'))

if (true) {
    WebUI.verifyTextPresent('Please enter your name', false)

    WebUI.verifyTextPresent('Enter your email address.', false)

    WebUI.verifyTextPresent('Enter your organization name', false)

    WebUI.verifyTextPresent('Please select number of licenses', false)

    WebUI.verifyTextPresent('Enter your phone number', false)

    WebUI.verifyTextPresent('Please click on the reCAPTCHA box', false)

    WebUI.verifyTextPresent('Please click on the reCAPTCHA box', false)
}
