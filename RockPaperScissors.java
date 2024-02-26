/**
 * @author Diego
 * @version 1.0
 * 
 * Esta clase genera un juego de piedra papel tijera contra el ordenador que devuelbe uno de estos 3 valores de manera aleatoria
 */

package examen;

import java.util.*;

/**
 * Este metodo representa la inicializacion de los objetos que se utilizaran en esta clase 
 */

public class RockPaperScissors {
	/*
	 * Esta variable indica el numero que el usuario introducirá en la consola para elegir o piedra o papel o tijeras
	 */
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	public Object checkGame;
	/*
	 * Esta variable almacenara en un arraylist la equivalencia entre el numero 1 2 o 3 y piedra papel o tijeras que se utilizaran en el juego
	 */
	public static List<String> optionList;

	public RockPaperScissors() {
	}

	/**
	 * 
	 * @param args
	 * @hidden
	 */
	public static void main(String[] args) {
		optionList = Arrays.asList("Rock", "Paper", "Scissors");
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(userChoice, computerChoice));
		scanner.close();
	}
/**
 * 
 * @param userChoice
 * @param computerChoice
 * @return devuelve el resultado del juego piedra papel o tijeras
 * Este metodo comprueba los distintos resultados que se pueden obtener segun el numero introducido y el generado aleatoriamente por el ordenador
 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}