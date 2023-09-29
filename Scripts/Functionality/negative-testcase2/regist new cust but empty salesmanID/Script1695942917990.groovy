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

String randomText = RandomStringUtils.randomAlphanumeric(5)

String randomNum = RandomStringUtils.randomNumeric(5)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Prieds Technology/input_IDUsername_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Master'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Management'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Customer Register'))

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Customer Biodata_createcustomer-custo_d931ad'), 
    'customerid'+randomText)


WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Salesman ID_createcustomer-customerre_2602e6'), 
    'customerName' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Customer Name_createcustomer-customer_9f598b'), 
    'PIC' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_PIC_createcustomer-customerregister-c_7d29d8'), 
    ('email' + randomText) + '@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Email_createcustomer-customerregister_6409b8'), 
    'city' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_City_createcustomer-customerregister-_1096a9'), 
    'reMark' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Remark_createcustomer-customerregiste_e3ba5d'), 
    '08.178.554.2-123.321' + randomNum)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_NPWP_createcustomer-customerregister-_b2e4d8'), 
    'tier' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/textarea_Tier_createcustomer-customerregist_831bae'), 
    'address1' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/textarea_Address_createcustomer-customerreg_2c8b43'), 
    'address2' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Address 2_createcustomer-customerregi_b33ca3'), 
    '0801' + randomNum)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Contact No_createcustomer-customerreg_0f8d35'), 
    'region' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Region_createcustomer-customerregiste_b1824f'), 
    'province' + randomText)

WebUI.setText(findTestObject('Object Repository/Page_Prieds Technology/input_Province_createcustomer-customerregis_1acb6e'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/input_Province_createcustomer-customerregis_1acb6e'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_JNE Express'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/div_Term Of Payment'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_NET0'))

WebUI.click(findTestObject('Object Repository/Page_Prieds Technology/span_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/div_Mohon Isi Customer ID Terlebih Dahulu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Prieds Technology/img_concat(id(, , -img-snackbar, , ))_-img-_6a7c1a'))

WebUI.closeBrowser()

