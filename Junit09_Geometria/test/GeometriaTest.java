import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	@Test
	public void testConstructorGeometriaConInt() {
		Geometria resultado = new Geometria(6);
		int esperado = 6;
		String texto = "Rombo";
		assertEquals(esperado, resultado.getId());
		assertEquals(texto, resultado.getNom());
	}
	@Test
	public void testConstructorGeometriaSinInt() {
		Geometria resultado = new Geometria();
		int esperado = 9;
		String texto = "Default";
		assertEquals(esperado, resultado.getId());
		assertEquals(texto, resultado.getNom());
	}
	@Test
	public void testAreaCuadrado() {
		int resultado = Geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = Geometria.areaCirculo(10);
		double esperado = 314.16;
		double diferencia = 1;
		assertEquals(esperado,resultado, diferencia);
	}
	@Test
	public void testAreaTriangulo() {
		int resultado = Geometria.areatriangulo(2,2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRectangulo() {
		int resultado = Geometria.arearectangulo(2,5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaPentagono() {
		int resultado = Geometria.areapentagono(5, 4);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRombo() {
		int resultado = Geometria.arearombo(2,5);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRomboide() {
		int resultado = Geometria.arearomboide(2,5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaTrapecio() {
		int resultado = Geometria.areatrapecio(2,5, 10);
		int esperado = 30;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFigura() {
		String resultado = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(2);
		esperado = "Circulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(3);
		esperado = "Triangulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(4);
		esperado = "Rectangulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(5);
		esperado = "Pentagono";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(6);
		esperado = "Rombo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(7);
		esperado = "Romboide";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(8);
		esperado = "Trapecio";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(9);
		esperado = "Default";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testGetId() {
		Geometria resultado = new Geometria();
		int esperado = 9;
		assertEquals(esperado, resultado.getId());
	}
	@Test
	public void testGetNom() {
		Geometria resultado = new Geometria();
		String esperado = "Default";
		assertEquals(esperado, resultado.getNom());
	}
	@Test
	public void testGetArea() {
		Geometria resultado = new Geometria();
		double esperado = 0.0;
		assertEquals(esperado, resultado.getArea());
	}
	@Test
	public void testSetId() {
		Geometria resultado = new Geometria();
		int esperado = 6;
		resultado.setId(esperado);
		assertEquals(esperado, resultado.getId());
	}
	@Test
	public void testSetNom() {
		Geometria resultado = new Geometria();
		String esperado = "Rombo";
		resultado.setNom(esperado);
		assertEquals(esperado, resultado.getNom());
	}
	@Test
	public void testSetArea() {
		Geometria resultado = new Geometria();
		double esperado = 5.0;
		resultado.setArea(esperado);
		assertEquals(esperado, resultado.getArea());
	}
	@Test
	public void testToString() {
		Geometria resultado = new Geometria();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado.toString());
	}

}
