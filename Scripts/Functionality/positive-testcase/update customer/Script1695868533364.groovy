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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

String randomText = 'umkm' + RandomStringUtils.randomAlphanumeric(5)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Sign In_username'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/img_Hello,_style-people'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_IDUsername'))

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_IDUsername_password'), 
    'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/span_Login'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_Master'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_Customer Management'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/mat-icon_more_vert'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/button_Edit'))

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Customer ID_input-editcustomername-cu_78517f'), 
    'Customer-' + randomText)

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_Contact No'))

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Contact No_input-editcontactnno-custo_2aebb7'), 
    'UMKM' + randomText)

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_Remark'))

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_PIC_input-editremark-customermanagement'), 
    'umkm' + randomText)

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/textarea_Email_input-editaddress-customerma_e85674'), 
    'gang mawar' + randomText)

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/textarea_Address_input-editaddress2-custome_2f951e'), 
    'rt6rw7' + randomText)

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Address 2_input-editcity-customermanagement'), 
    'Sleman' + randomText)

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_City_input-editregion-customermanagement'), 
    'Sleman' + randomText)

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Region_input-editprovince-customermanagement'), 
    'Special region of yogyakarta' + randomText)

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Province_input-editpreferedcustomer-c_5971db'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/span_Ali Express'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/div_NET75'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/span_Custom'))

WebUI.setText(findTestObject('Object Repository/update customer/Page_Prieds Technology/input_Term Of Payment_input-edittermofpayme_fc94da'), 
    '1')

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/button_Save'))

WebUI.click(findTestObject('Object Repository/update customer/Page_Prieds Technology/button_Yes'))

