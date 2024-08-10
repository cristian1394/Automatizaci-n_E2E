package base;

import org.openqa.selenium.WebDriver;


public class PagObjectPago extends MapObjectPago{

	public PagObjectPago(WebDriver driver) {
		super(driver);
	}
	public void pagoProducto() throws InterruptedException {

		clicElemento(btnCarrito);
		clicElemento(btnPago);
		enviarPalabra(nombreAleatorio(),lblNombre);
		enviarPalabra("Colombia",lblCountry);
		enviarPalabra(nombreAleatorio(),lblCity);
		enviarPalabra(conversionTajerta(),lblCard);
		enviarPalabra(mesAleatorio(),lblMonth);
		enviarPalabra(anioAleatorio(),lblYear);
		clicElemento(btnCompra);
		clicElemento(btnAccept);
	}
}
