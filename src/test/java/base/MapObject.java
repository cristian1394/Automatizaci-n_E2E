package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Cristian Ramos
// 10-08-2024
public class MapObject extends ClaseBase{
	public MapObject(WebDriver driver) {
		super(driver);
	}
	protected By btnPhone= By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
	protected By imgCel = By.xpath("//img[@src=\"imgs/galaxy_s6.jpg\"]");
	protected By lblSamsung= By.xpath("//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-core')]");
	protected By btnCart= By.xpath("//*[contains(text(),'Add to cart')]");
	protected By btnHome= By.xpath("//a[contains(text(),'Home')]");
	protected By btnPhoneL= By.xpath("//a[contains(text(),'Nokia lumia 1520')]");
	protected By imgCell= By.xpath("//img[@src=\"imgs/Lumia_1520.jpg\"]");
	protected By lblSamungs= By.xpath("//p[contains(text(),'The Nokia Lumia 1520 is powered by 2.2GHz')]");

	
	
	protected String textoSeteado= "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.";
	protected String textoSamsung= "The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.";

}
