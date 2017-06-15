package Examen_Daniel_Jara;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRHumanos {
	
	//	Caso De Prueba Valido N� 1
	@Test
	public void CasoPruebaValido1() {
		assertEquals("Complemento 3: 300",300, RHumanos.Validar("100;Diego Alvarez;1;SI"));
	}
	
	//	Caso De Prueba Valido N� 2
	@Test
	public void CasoPruebaValido2() {
		assertEquals("Complemento 2: 500",500, RHumanos.Validar("101;Alba G�mez;7;NO"));
	}

	
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido1() {
		RHumanos.Validar("000;Jesus Garcia;10;SI");
	}
	//	Caso De Prueba No Valido N� 1
	
	
	//	Caso De Prueba No Valido N� 2
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido2() {
		RHumanos.Validar("1001;Carmen Ruiz;9;NO");
	}
	
	//	Caso De Prueba No Valido N� 3
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido3() {
		RHumanos.Validar("abc;Sandra L�pez;2;SI");
	}
	
	//	Caso De Prueba No Valido N� 4 
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido4() {
		RHumanos.Validar("123;Vanesa Perez;2;SI");
	}
	
	//	Caso De Prueba No Valido N� 5
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido5() {
		RHumanos.Validar("123; Juan Gonz�lez Fern�ndez;3;SI");
	}
	
	//	Caso De Prueba No Valido N� 6
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido6() {
		RHumanos.Validar("123;Carmen Ruiz;-1;SI");
	}
	
	//	Caso De Prueba No Valido N� 7
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido7() {
		RHumanos.Validar("123;Carmen Ruiz;111;NO");
	}
	
	//	Caso De Prueba No Valido N� 8
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido8() {
		RHumanos.Validar("123;Carmen Ruiz;ab;NO");
	}
	
	//	Caso De Prueba No Valido N� 9
	@Test(expected=Exception.class)
	public void CasoPruebaNoValido9(){
		RHumanos.Validar("123;Carmen Ruiz;8;*");
	}


}



