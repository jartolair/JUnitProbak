import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitProba {
	
	Coche opel=new Coche("SS4352HF","Opel","zafira");
	@Test
	public void marcaCorrecta() {
		String marca="Opel";
		assertEquals(marca, opel.getMarca());
	}
	@Test
	public void estaParado(){
		assertFalse(opel.estaEnMarcha());
	}
	@Test
	public void enMarcha(){
		opel.acelerar(40);
		assertTrue(opel.estaEnMarcha());
	}
	@Test
	public void tieneColor(){
		opel.setColor("Rojo");
		assertNotNull(opel.getColor());
	}
	@Test
	public void conductor(){
		assertNull(opel.getConductor());
	}
	

}
