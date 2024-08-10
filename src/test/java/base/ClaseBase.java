package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.github.javafaker.Faker;

public class ClaseBase {
	public ClaseBase(WebDriver driver) {
		super();
	}
	protected static WebDriver driver;

	
	public static WebDriver ConexionChrome() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	public void tiempoEsperado(long tiempo) throws InterruptedException{
		Thread.sleep(tiempo);
	}

	public void clicElemento(By locator) throws InterruptedException {
		driver.findElement(locator).click();
		tiempoEsperado(4000);
	}
	public void enviarPalabra(String palabra, By locator) throws InterruptedException{
		driver.findElement(locator).sendKeys(palabra);
		tiempoEsperado(4000);
		
	}
	public boolean elementoDesplegado(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch(NoSuchElementException e) {
			System.out.println(e);
		}
		return false;
	}
	public boolean asercionTexto(String texto, By locator) {
		try {
			Assert.assertEquals(driver.findElement(locator).getText(), texto);
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		return false;
	}
	public void scrollDown() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	}
	public void aceptarMensaje() {
		driver.switchTo().alert().accept();
	}
	@SuppressWarnings("deprecation")
	public void tiempoEsperaImplicito() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public String nombreAleatorio() {
		final var faker = new Faker();
		final var nombre = faker.name().name();
		return nombre;
	}
	public String mesAleatorio() {
		final var faker = new Faker();
		final var mes = faker.number().numberBetween(1, 12);
		final var conversionmes= String.valueOf(mes);
		return conversionmes;
	}
	public String anioAleatorio() {
		final var faker = new Faker();
		final var anio = faker.number().numberBetween(1900,2999);
		final var conversionanio = String.valueOf(anio);
		return conversionanio;
	}
	public String conversionTajerta() {
		final var faker = new Faker();
		final var card = faker.number().numberBetween(111111111, 999999999);
		final var conversioncard= String.valueOf(card);
		return conversioncard;
	}
}