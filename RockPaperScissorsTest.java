package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	RockPaperScissors miRockPaperScissors = new RockPaperScissors();

	@Test
	void test1() {
		String cadenaTest = miRockPaperScissors.checkGame = (3, 1);
		String cadenaEsperada = "It´s a tie"; 
		assertEquals(cadenaEsperada, cadenaTest);
	}
	@Test
	void test2() {
		String cadenaTest = miRockPaperScissors.checkGame = (1, 2);
		String cadenaEsperada = "You win this round"; 
		assertEquals(cadenaEsperada, cadenaTest);
	}
	@Test
	void test3() {
		String cadenaTest = miRockPaperScissors.checkGame = (1, 3);
		String cadenaEsperada = "Computer win this round"; 
		assertEquals(cadenaEsperada, cadenaTest);
	}
	@Test
	void test4() {
		String cadenaTest = miRockPaperScissors.checkGame = (2, 1);
		String cadenaEsperada = "You win this round"; 
		assertEquals(cadenaEsperada, cadenaTest);
	}
}
