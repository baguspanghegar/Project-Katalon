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

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('percobaan 1/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('percobaan 1/Page_DemoShop/input_Email_Input.Email'), 'baguspanghegar@gmail.com')

WebUI.setEncryptedText(findTestObject('percobaan 1/Page_DemoShop/input_Password_Input.Password'), '/w+Bd4TKerZtE610zV3oHA==')

WebUI.click(findTestObject('percobaan 1/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('percobaan 1/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('percobaan 1/Page_DemoShop/button_Direct payment'))

WebUI.click(findTestObject('percobaan 1/Page_Payment Gateway/h4_Amount 8.00'))

WebUI.click(findTestObject('percobaan 1/Page_Payment Gateway/h4_Description Computer mouse'))

WebUI.click(findTestObject('percobaan 1/Page_Payment Gateway/button_Netherlands                        C_0baa08'))

WebUI.setText(findTestObject('percobaan 1/Page_Log in - BankSystem/input_Email_Input.Email'), 'pomeneb948@58as.com')

WebUI.setEncryptedText(findTestObject('percobaan 1/Page_Log in - BankSystem/input_Password_Input.Password'), 'M5G1XEmdU8oQJ6sVN+uT4Q==')

WebUI.click(findTestObject('percobaan 1/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('percobaan 1/Page_Confirm payment - BankSystem/button_Close'))

WebUI.click(findTestObject('percobaan 1/Page_Confirm payment - BankSystem/p_Destination bank account ABCO50239280'))

WebUI.selectOptionByValue(findTestObject('percobaan 1/Page_Confirm payment - BankSystem/select_BRI - 500.00                    Link_5a499a'), 
    'e450079f-bb43-4c7e-9d11-7a90c529d1cc', true)

WebUI.click(findTestObject('percobaan 1/Page_Confirm payment - BankSystem/button_Pay 8.00'))

WebUI.click(findTestObject('percobaan 1/Page_DemoShop/a_Links'))

