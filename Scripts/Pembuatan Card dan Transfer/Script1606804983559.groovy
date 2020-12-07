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

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_Home Page - BankSystem/a_Your Cards'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/a_Create card'))

WebUI.selectOptionByValue(findTestObject('Object Repository/percobaan 2/Page_Create card - BankSystem/select_BRILink Aja'), 
    '81372be0-31fa-4834-9393-6a320ac3a76a', true)

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_Create card - BankSystem/button_Create'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/h5_Card number 2013908030240217'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/p_Expiration 1124'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/p_Account Link Aja'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/p_Cardholder name Bagus Panghegar'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_All cards - BankSystem/p_Security code 989'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_Home Page - BankSystem/a_New Transfer'))

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_Payment types - BankSystem/a_Create new payment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/percobaan 2/Page_Create internal money transfer - BankSystem/select_Select source account...            _0bb758'), 
    '81372be0-31fa-4834-9393-6a320ac3a76a', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/percobaan 2/Page_Create internal money transfer - BankSystem/select_...or choose another one of your acc_61355f'), 
    'CBAR40249884', true)

WebUI.setText(findTestObject('Object Repository/percobaan 2/Page_Create internal money transfer - BankSystem/input__Amount'), 
    '15.00')

WebUI.setText(findTestObject('Object Repository/percobaan 2/Page_Create internal money transfer - BankSystem/input_(optional)_Description'), 
    'ganti uang')

WebUI.click(findTestObject('Object Repository/percobaan 2/Page_Create internal money transfer - BankSystem/button_Pay'))

