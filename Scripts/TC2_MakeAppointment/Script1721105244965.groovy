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

WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/h2_Make Appointment'), 
    15)

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Facility'), 
    'Facility')

WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Healthcare Program'), 
    'Healthcare Program')

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Visit Date (Required)'), 
    'Visit Date (Required)')

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/td_30'))

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Visit Date (Required)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/th_'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/td_30'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/label_Comment'), 
    'Comment')

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'for testing pupose')

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/button_Book Appointment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    15)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    0)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

