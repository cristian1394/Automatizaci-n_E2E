package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Cristian Ramos
// 10-08-2024
public class MapObjectPago extends ClaseBase{
	public MapObjectPago(WebDriver driver) {
		super(driver);
	}
	protected By btnCarrito = By.xpath("//a[@id=\"cartur\"]");
	protected By btnPago= By.xpath("//button[contains(text(),'Place Order')]");
	protected By lblNombre= By.xpath("//input[@id=\"name\"]");
	protected By lblCountry = By.xpath("//input[@id=\"country\"]");
	protected By lblCity= By.xpath("//input[@id=\"city\"]");
	protected By lblCard= By.xpath("//input[@id=\"card\"]");
	protected By lblMonth= By.xpath("//input[@id=\"month\"]");
	protected By lblYear= By.xpath("//input[@id=\"year\"]");
	protected By btnCompra= By.xpath("//button[@onclick=\"purchaseOrder()\"]");
	protected By btnAccept= By.xpath("//button[contains(text(),'OK')]");
}
