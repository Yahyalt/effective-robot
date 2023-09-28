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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/img_Hello,_style-people'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_IDUsername'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prieds Technology/input_IDUsername_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Master'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Management'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Register'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Salesman ID'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_REYNER'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Salesman ID_createcustomer-customerre_2602e6'), 
    'Customer-UMKM' + RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Customer Name_createcustomer-customer_9f598b'), 
    'UMKM')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_PIC_createcustomer-customerregister-c_7d29d8'), 
    'umkm@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Email_createcustomer-customerregister_6409b8'), 
    'Sleman')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Remark'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_City_createcustomer-customerregister-_1096a9'), 
    'umkm')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_NPWP'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_NPWP'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Remark_createcustomer-customerregiste_e3ba5d'), 
    '08.178.554.2-123.321')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_NPWP_createcustomer-customerregister-_b2e4d8'), 
    'umkm')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/textarea_Tier_createcustomer-customerregist_831bae'), 
    'gang mawar')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Address 2_createcustomer-customerregi_b33ca3'), 
    '001122334455')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Contact No_createcustomer-customerreg_0f8d35'), 
    'Sleman')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Province'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Region_createcustomer-customerregiste_b1824f'), 
    'Special region of yogyakarta')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Province_createcustomer-customerregis_1acb6e'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/input_Province_createcustomer-customerregis_1acb6e'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_SiCepat'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_NET75'))

//WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/mat-icon_add'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Prieds Technology/mat-icon_add'), 'C:\\Users\\LENOVO\\git\\effective-robot\\Object Repository')
FilePath = WebUI.getAttribute(findTestObject('Object Repository/Page_Prieds Technology/mat-icon_add'), 'value')
WebUI.verifyMatch(FilePath, 'C:\\Users\\LENOVO\\git\\effective-robot\\Object Repository', false)

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Generate ID'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer List'))

