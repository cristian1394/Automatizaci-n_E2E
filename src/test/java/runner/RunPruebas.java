package runner;

import org.testng.annotations.Test;

import base.ClaseBase;
import base.PagObject;
import base.PagObjectPago;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class RunPruebas {
	PagObject pagina;
	PagObjectPago paginapago;
	public WebDriver driver;
	Properties propiedades;
@BeforeTest
public void beforeTest() throws IOException {
	propiedades = new Properties();
	  InputStream entradas = null;
	  try {
		  entradas = new FileInputStream("./src/test/resources/file/recurso");
		 propiedades.load(entradas);
	  } catch(FileNotFoundException e) {
		  e.getStackTrace();
		  System.out.println(e);
	  }
	pagina = new PagObject(driver);
	paginapago= new PagObjectPago(driver);
	driver = ClaseBase.ConexionChrome();
	pagina.obtenerURL(propiedades.getProperty("url"));
	
	  }

  @Test(priority = 1)
  public void pruebaElemento() throws InterruptedException {
	  pagina.agregarCarrito();
	  
  }
 
  @Test(priority = 2)
  public void pagoProductos() throws InterruptedException{
  	  paginapago.pagoProducto();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
