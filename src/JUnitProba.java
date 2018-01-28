import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitProba {
	
	Coche opel=new Coche("SS4352HF","Opel","zafira");
	@Test
	public void cerrarCoche(){
		opel.setNum_puertas(5);
		opel.cerrarCoche();
		
		String[] esperado={"Cerrado","Cerrado","Cerrado","Cerrado","Cerrado"};
		assertArrayEquals(esperado, opel.getEstado_de_puertas());
		
	}

	@Test
	public void testValorar() {
		
		opel.setAnioMatriculacion(3);
		opel.setKilometraje(500);
		double precio=opel.valorar();
		double precioEsperado=101500;
		assertEquals(precioEsperado, precio, 0.01);
	}

	@Test
	public void enMarcha(){
		opel.acelerar(40);
		assertTrue(opel.estaEnMarcha());
		
		opel.aparcar();
		assertFalse(opel.estaEnMarcha());
	}
	@Test
	public void tieneColor(){
		opel.pintar("Rojo");
		assertNotNull(opel.getColor());
	}
	@Test
	public void aparcar(){
		opel.setConductor("Patxi");
		opel.aparcar();
		assertNull(opel.getConductor());
	}
	@Test
	public void repostar(){
		opel.setCapacidad_combustible(50);
		opel.setLitros_combustible(20);
		opel.repostar(10);
		assertNotSame(20, opel.getLitros_combustible());
	}
	
	@Test
	public void matricula(){
		Coche opel2=opel;
		opel2.acelerar(100);
		assertSame(opel2, opel);
	}
	
	

}
