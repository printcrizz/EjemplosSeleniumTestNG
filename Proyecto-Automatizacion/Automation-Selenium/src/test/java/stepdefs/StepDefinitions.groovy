package stepdefs;


import cucumber.api.DataTable
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When
import groovy.json.JsonSlurper
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import utils.GeneralUtils
import utils.RestUtils;
import utils.SeleniumUtils
import utils.XpathEnum;
import java.lang.reflect.*;

public class StepDefinitions {
    public SeleniumUtils sel = new SeleniumUtils()

    private String uri;

    @Then("^Close Browser\$")
    public void closeBrowserInstance(){
        sel.CloseBrowser()
    }
    @And("^Abrir navegador con la siguiente URL \"([^\\\"]*)\"\$")
    void OpenBrowser(String url){
        uri =url
        sel.OpenBrowser(url)
        sel.maximizeBrowser()
    }
    @And("^Esperar \"([^\\\"]*)\" segundos\$")
    static void WaitNSeconds(int n){
        Thread.sleep(n*1000)
    }
    @And("^La pagina deberia tener los siguientes textos\$")
    void ValidateInnerText(DataTable dt){
        boolean res=false;
        //List<String> aux = dt.asList(String.class)
        List<Map<String, String>> aux = dt.asMaps(String.class, String.class)
        for(int i = 0; i<aux.size();i++){
            res = sel.containsValueInXPath(aux.get(i).get("xpath"),aux.get(i).get("text").toString().trim())
        }
        Thread.sleep(1000)
        assert res;
    }
    @And("^Buscar botón \"([^\\\"]*)\" y presionarlo\$")
    void SearchAndClickButton(String buttonName){
        sel.clickButtonInXPath(sel.GetXpathByName(buttonName));
        //Thread.sleep(2000)
    }
    @And("^Validar Url contiene \"([^\\\"]*)\" extension\$")
    void ValidateUrl(String path){
        assert sel.GetCurrentURL().equalsIgnoreCase(uri+path);
    }
    @And("^Validar redireccionamiento a \"([^\\\"]*)\"\$")
    void ValidateRedirect(String ruta){
        assert sel.GetCurrentURL().equalsIgnoreCase(ruta)
    }
    @And("^Ingresar el Rut de Usuario \"([^\\\"]*)\" al formulario\$")
    void RutLogin(String value){
        sel.sendValuesXpath(sel.GetXpathByName("Ingreso_rut"),value)
        Thread.sleep(2000)
    }
    @And("^Ingresar la contrasena de Usuario \"([^\\\"]*)\" al formulario\$")
    void PasswordLogin(String value){
        sel.sendValuesXpath(sel.GetXpathByName("Password_rut"),value)
        Thread.sleep(2000)
    }
    @And("^Escribir \"([^\\\"]*)\" en el campo \"([^\\\"]*)\"\$")
    void SendValueToObject(String value, String field){
        sel.sendValuesXpath(sel.GetXpathByName(field),value)
        //Thread.sleep(2000)
    }
    @And("^El producto tiene \"([^\\\"]*)\" como nombre en xpath \"([^\\\"]*)\"\$")
    void ValidateText(String value, String xpath){
        assert sel.containsValueInXPath(sel.GetXpathByName(xpath),value)
    }

}
