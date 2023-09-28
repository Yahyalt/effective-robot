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

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prieds Technology/input_IDUsername_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/button_Login'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_account_balance Accounting'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_book Sales'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_content_paste Purchasing'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_house Warehouse'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_list'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_list_alt Approval Documents'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_poll Dashboard'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_settings Master'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/button_shop Marketplace'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_book Sales house Warehouse settings Master content_paste Purchasing account_balance Accounting list_alt Approval Documents shop Marketplace poll Dashboard'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_closeLog Out'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_Location  SITE A'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_Marketplace'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_Master'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_NextSME Hub Prieds'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_Sales'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_SME Hub Prieds'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_System  OMS'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/div_Thu, 28 Sep 2023 0548 PM'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/font_Salesman REYNER'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/img_Sales_logo-transition ng-tns-c338-5'))

//WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/img_TESTING QA WMS LITE_banner-top'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/input_SME Hub Prieds_submit'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_insert_drive_file'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_language'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_notifications'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_ondemand_video'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_person'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_support_agent'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_sync'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/mat-icon_tips_and_updates'))

WebUI.verifyElementVisible(findTestObject('dashboard/Page_Prieds Technology/span_person TESTING QA WMS LITE'))

