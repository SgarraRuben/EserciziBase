package objectmethod;
import prog.io.ConsoleInputManager;

public class Sum {
	public static int sommaNumeri(int value1, int value2) {
		int sum = value1+value2;
		return sum;
	}

	public static void main(String[] args) {
		ConsoleInputManager in=new ConsoleInputManager();
		int value1;
		int value2;
		String goForward;

		do {
			value1 = in.readInt("inserrisaci un numero");
			value2 = in.readInt("inserisci un altro numero");
			int sum=sommaNumeri(value1,value2);
			System.out.println(sum);
			goForward = in.readLine("vuoi continuare?(Y/N)");
			if (!"y".equalsIgnoreCase(goForward) && !"n".equalsIgnoreCase(goForward) ) {
				System.err.println("non riconosco la risposta!!! ");
				goForward = in.readLine("vuoi continuare?(Y/N)");
			}
		}while(!"n".equalsIgnoreCase(goForward));
		System.out.println("Fine programma");
	}	
}

