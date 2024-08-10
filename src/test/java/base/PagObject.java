package base;



import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PagObject extends MapObject{
	public PagObject(WebDriver driver) {
		super(driver);
	}
	public void obtenerURL(String URL) {
		driver.get(URL);
	}
	public void agregarCarrito() throws InterruptedException {
		tiempoEsperaImplicito();
		scrollDown();
		clicElemento(btnPhone);
		try {
			if(elementoDesplegado(imgCel)) {
			asercionTexto(textoSeteado,lblSamsung);	
			clicElemento(btnCart);
			tiempoEsperaImplicito();
			aceptarMensaje();
			}
		}catch(NoSuchElementException e) {
			System.out.println("No se encontró el primer elemento, falla la automatización");
		}
		clicElemento(btnHome);
		tiempoEsperaImplicito();
		clicElemento(btnPhoneL);
		try {
    	if(elementoDesplegado(imgCell)) {
    		asercionTexto(textoSamsung,lblSamungs);
			clicElemento(btnCart);
			tiempoEsperaImplicito();
			aceptarMensaje();
			
		}
		}catch(NoSuchElementException e) {
			System.out.println("No se encontró el segundo elemento, falla la automatización");
		}
	}


}
