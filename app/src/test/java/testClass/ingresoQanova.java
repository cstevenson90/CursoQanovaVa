package testClass;

import org.openqa.selenium.WebDriver;

import pages.AsistenciaQanova;

public class ingresoQanova {

    private static AsistenciaQanova asistenciaQanova;

    public static void ingresar(WebDriver webDriver){
        asistenciaQanova = new AsistenciaQanova(webDriver);
        asistenciaQanova.ingresarRut("172455492");
        asistenciaQanova.ingresarPassword("QAnova2022#");
        asistenciaQanova.clickBtnIngresar();
    }
    
}
