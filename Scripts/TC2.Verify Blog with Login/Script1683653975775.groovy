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

WebUI.click(findTestObject('Home_Page/Btn_LogIn'))

WebUI.setText(findTestObject('Home_Page/Input_Email'), GlobalVariable.User1)

WebUI.setText(findTestObject('Home_Page/Input_Password'), GlobalVariable.Password1)

WebUI.click(findTestObject('Home_Page/Submit_Login'))

WebUI.click(findTestObject('OverflowMenu/Btn_OverFlow'))

WebUI.scrollToElement(findTestObject('OverflowMenu/Blog'), 10)

WebUI.click(findTestObject('OverflowMenu/Blog'))

CurrentUrL = WebUI.getUrl()

//println(CurrentUrL)
ExpectedUrl = 'https://staging.myinterviewpractice.com/blog/'

WebUI.verifyEqual(CurrentUrL, ExpectedUrl)

