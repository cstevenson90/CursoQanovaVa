package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AsistenciaQanova;
import testClass.ingresoQanova;

public class Prueba2 {
    ChromeDriver webDriver;
    String url = "http://qasgp.cf/index.php";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/excstev/Repos/CursoQanovaVa/driverNav/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closeDriver(){
        webDriver.close();
    }

    @Test
    public void ingresarAsistencia(){
        AsistenciaQanova asistenciaQanova = new AsistenciaQanova(webDriver);
        ingresoQanova.ingresar(webDriver);
    }
    
}
