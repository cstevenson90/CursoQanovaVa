package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    @FindBy(className = "gLFyf")
    WebElement inputBuscar;

    @FindBy(xpath = "//input[contains{@data-ved,'0ahUKEwiegaqykdH7AhXOLLkGHbXbCIYQ4dUDCAg'}]")
    WebElement btnBuscar;

    public Google (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void ingresarBusqueda (String busqueda){
        inputBuscar.sendKeys(busqueda);
    }

    public void clickBtnBuscar(){
        btnBuscar.click();
    }

    
}
