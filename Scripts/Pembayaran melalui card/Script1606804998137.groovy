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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://banksystem-2.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_Home - BankSystem/a_Login'))

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_Log in - BankSystem/input_Email_Input.Email'), 'pomeneb948@58as.com')

WebUI.setEncryptedText(findTestObject('Object Repository/percobaan 3/Page_Log in - BankSystem/input_Password_Input.Password'), 
    'M5G1XEmdU8oQJ6sVN+uT4Q==')

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_Home Page - BankSystem/a_DemoShop'))

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Email_Input.Email'), 'baguspanghegar@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Password_Input.Password'), '/w+Bd4TKerZtE610zV3oHA==')

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/a_My orders'))

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/a_Card payment'))

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/main_Card payment    Computer mouse    8.00_6eb755'))

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Card number_Number'), '2019326258840929')

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Cardholder name_Name'), 'Bagus Panghegar')

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Expiration date_ExpiryDate'), '12/24')

WebUI.setText(findTestObject('Object Repository/percobaan 3/Page_DemoShop/input_Security code_SecurityCode'), '934')

WebUI.click(findTestObject('Object Repository/percobaan 3/Page_DemoShop/button_Pay'))

