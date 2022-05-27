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

WebUI.navigateToUrl('https://account.sehatq.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/span_Email'))

WebUI.setText(findTestObject('Object Repository/Login/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/input_Manfaat Log in_email'), 
    'maulanalanadari@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/span_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/input_Email_password'), 
    'KYFyBF/J3vDqozd6pBLTjg==')

WebUI.click(findTestObject('Login/Page_SehatQ  Portal Informasi Terbaru Seput_797e81/button_Login'))

WebUI.verifyElementVisible(findTestObject('Login/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_Ryan Maulana'))

WebUI.click(findTestObject('Object Repository/Login/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_Ryan Maulana'))

WebUI.click(findTestObject('Object Repository/Login/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/img_SehatQ For Corporate_sc-jzJRlG dOVASO'))

WebUI.click(findTestObject('Object Repository/Login/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/a_Sign Out'))

WebUI.closeBrowser()

