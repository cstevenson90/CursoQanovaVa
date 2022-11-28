package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsistenciaQanova {

    @FindBy (xpath = "//input[@id='rut']")
    WebElement inputRut;
    
    @FindBy (xpath = "//*[@id='loginform']/div[2]/input")
    WebElement inputPassword;

    @FindBy (xpath = "//*[@id='loginform']/div[3]/input[1]")
    WebElement btnIngresar;

    public AsistenciaQanova (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void ingresarRut(String rut){
        inputRut.sendKeys(rut);
    }

    public void ingresarPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void clickBtnIngresar(){
        btnIngresar.click();
    }

}
