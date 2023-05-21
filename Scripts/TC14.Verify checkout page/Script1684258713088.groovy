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

WebUI.click(findTestObject('Pricing/Btn_ChoosePlus3Months'))

WebUI.verifyElementPresent(findTestObject('SignUp/Verify_SignUpPage'), 1)

String randomNumber = Math.abs(new Random().nextInt() % 30) + 1222

println(randomNumber)

randomEmail = (('test' + randomNumber) + '@mailinator.com')

println(randomEmail)

WebUI.sendKeys(findTestObject('SignUp/Input_Email'), randomEmail)

WebUI.click(findTestObject('SignUp/Btn_ContinueEmailSignUp'))

String randomName = Math.abs(new Random().nextInt() % 30) + 1

randomName = ('Automation' + randomName)

println(randomName)

WebUI.sendKeys(findTestObject('SignUp/Input_AccountName'), randomName)

WebUI.sendKeys(findTestObject('SignUp/Input_AccountPassword'), 'Automation@1234')

WebUI.click(findTestObject('SignUp/Btn_ContinueStep1'))

WebUI.click(findTestObject('SignUp/Btn_SelectPlanStep2'))

WebUI.click(findTestObject('SignUp/Btn_CheckoutPayPal'))

WebUI.sendKeys(findTestObject('SignUp/Input_PaypalEmail'), GlobalVariable.PayPalEmail)

WebUI.click(findTestObject('SignUp/Btn_SubmitPayPalEmail'))

WebUI.sendKeys(findTestObject('SignUp/Input_PayPalPassword'), GlobalVariable.PayPalPassword)

WebUI.click(findTestObject('SignUp/Btn_SubmitPayPalPassword'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('SignUp/Btn_CompletePurchase'))

WebUI.delay(3)

WebUI.click(findTestObject('SignUp/Btn_ClickHerePayPalLoading'))

//WebUI.waitForPageLoad(20)

//WebUI.enableSmartWait()

WebUI.delay(5)

//WebUI.acceptAlert()

//WebUI.verifyAlertPresent(16)
//Text = WebUI.getAlertText()
//println(Text)
WebUI.waitForElementVisible(SignUp / Btn_StartPracticing, 10)

//WebUI.switchToFrame(findTestObject('SignUp/Btn_StartPracticing'), 0)
WebUI.click(findTestObject('SignUp/Btn_StartPracticing'))

