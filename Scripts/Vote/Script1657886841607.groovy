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

WebUI.navigateToUrl('https://lesechosdutouquet.nordlittoral.fr/147787/article/2022-06-30/concours-photo-montrez-nous-la-plus-belle-photo-de-votre-chien-en-promenade-sur#l5lb6r47qsmp9ur58y')

WebUI.setViewPortSize(1920, 1080)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/button_Accepter  Fermer'))

WebUI.delay(12)

WebUI.click(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/a_X'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/input_concat(Votez pour le plus beau chien de la cte d, , Opale )_jouer'))

if (WebUI.verifyElementPresent(findTestObject('Page_Concours photo  votez pour la plus bel_494087/input_concat(Votez pour le plus beau chien de la cte d, , Opale )_jouer'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/input_concat(Votez pour le plus beau chien de la cte d, , Opale )_jouer'))
}

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/input_trie par_keyword'), 
    'Gaspard')

WebUI.sendKeys(findTestObject('Page_Concours photo  votez pour la plus bel_494087/input_trie par_keyword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Concours photo  votez pour la plus bel_494087/tri'))

WebUI.click(findTestObject('Page_Concours photo  votez pour la plus bel_494087/plus de votes'))

WebUI.click(findTestObject('Object Repository/Page_Concours photo  votez pour la plus bel_494087/i_Votes_fa fa-heart'))

WebUI.delay(1)

WebUI.closeBrowser()

