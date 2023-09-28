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

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Hello,welcomeSign InIDUsernamePasswordv_1847fc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/img_Hello,_style-people'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_No Data_cdk-overlay-backdrop cdk-overla_66c7c7'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/label_Hello,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/label_welcome'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Hello,welcome'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Sign InIDUsernamePasswordvisibility_off_fea716'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/mat-card_Sign InIDUsernamePasswordvisibilit_57b472'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/label_Sign In'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_IDUsername'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Version 0.1.119'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/label_Need an Account Sign Up'))



