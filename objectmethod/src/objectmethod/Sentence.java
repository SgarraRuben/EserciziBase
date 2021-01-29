package objectmethod;

import prog.io.ConsoleInputManager;

public class Sentence {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInputManager in = new ConsoleInputManager();
		String sentence=in.readLine("scrivi una farese? ");
		System.out.println("la prima parola della frase che hai scritto è : ");
		String firstWorld = sentence.substring(0, sentence.indexOf(' '));
		System.out.println(firstWorld);
	

	}

}
