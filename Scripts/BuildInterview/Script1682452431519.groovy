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
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane
import java.awt.Component as Component
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Home_Page/Btn_LogIn'))

WebUI.setText(findTestObject('Home_Page/Input_Email'), GlobalVariable.Username1)

WebUI.setText(findTestObject('Home_Page/Input_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Home_Page/Submit_Login'))

WebUI.click(findTestObject('OverflowMenu/Btn_OverFlow'))

WebUI.click(findTestObject('OverflowMenu/BuildInterview'))

WebUI.verifyElementText(findTestObject('BuildInterview/Verify_BuildInterview'), 'BUILD AN INTERVIEW')

WebUI.click(findTestObject('BuildInterview/Btn_NewInterview'))

Date todaysDate = new Date()

def formattedDate = todaysDate.format('dd-MMM-yyyy HH:MM')

WebUI.setText(findTestObject('BuildInterview/Input_InterviewName'), formattedDate)

WebUI.click(findTestObject('BuildInterview/Btn_CreateInterview'))

WebUI.setText(findTestObject('BuildInterview/Input_Q1'), 'Test Question 1')

//WebUI.setText(findTestObject('BuildInterview/Input_TimeLimit'), RandomStringUtils.randomnumeric(1))
//WebUI.setText(findTestObject('BuildInterview/Input_Timer1'), RandomStringUtils.randomnumeric(1))
WebUI.setText(findTestObject('BuildInterview/Input_Q2'), 'Test Question 2 ')

WebUI.setText(findTestObject('BuildInterview/Input_Q3'), 'Test Question 3 ')

WebUI.setText(findTestObject('BuildInterview/Input_Q4'), 'Test Question 4 ')

WebUI.setText(findTestObject('BuildInterview/Input_Q5'), 'Test Question 5')

WebUI.click(findTestObject('BuildInterview/Btn_AddQuestion'))

WebUI.setText(findTestObject('BuildInterview/Input_Q6'), 'Test Question 6')

WebUI.click(findTestObject('BuildInterview/Btn_SaveInterview'))

WebUI.verifyElementText(findTestObject('BuildInterview/Verify_InterviewCreated'), formattedDate)

