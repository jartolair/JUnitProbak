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
		opel.pintar("Rojo");
		assertNotNull(opel.getColor());
	}
	@Test
	public void aparcar(){
		opel.aparcar();
		assertNull(opel.getConductor());
	}
	@Test
	public void velocidadDiferente(){
		opel.acelerar(40);
		assertNotSame(20, opel.getVelocidad());
	}
	
	@Test
	public void matricula(){
		String matricula="SS4352HF";
		assertSame(matricula, opel.getMatricula());
	}
	
	

}
