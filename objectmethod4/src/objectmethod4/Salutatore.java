package objectmethod4;

import prog.io.ConsoleInputManager;

public class Salutatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInputManager in = new ConsoleInputManager();
		String name = in.readLine("Come ti chiami?");
		String greetingType = in.readLine("inserisci Y se vuoi un saluto formale o inserisci N se vuoi un saluto informale ");
		if (!"y".equalsIgnoreCase(greetingType) && !"n".equalsIgnoreCase(greetingType) ) {
			System.err.println("non riconosco la risposta!!! ");
			greetingType = in.readLine("inserisci Y se vuoi un saluto formale o inserisci N se vuoi un saluto informale ");
		}
		String hour = in.readLine("inserisci che ore sono nel formato 24 (HH:mm)");
		double hourDouble = Double.parseDouble(hour.replace(':', '.'));
		ISalutatore salutatore; 
		switch(greetingType.toUpperCase()) {
		case "Y": 
			salutatore= new SalutatoreFormale();
			if(hourDouble>=6.00 && hourDouble<=13.00) {
				System.out.println(salutatore.salutaMattino(name));
			}else if(hourDouble > 13.00 && hourDouble <= 22.00) {
				System.out.println(salutatore.salutaSera(name));
			}else if(hourDouble > 22.00 && hourDouble < 6.00) {
				System.out.println(salutatore.salutaNotte(name));
			}
			break;
		case "N":
			salutatore = new SalutatoreInformale();
			if(hourDouble>=6.00 && hourDouble<=13.00) {
				System.out.println(salutatore.salutaMattino(name));
			}else if(hourDouble > 13.00 && hourDouble <= 22.00) {
				System.out.println(salutatore.salutaSera(name));
			}else if(hourDouble > 22.00 && hourDouble < 6.00) {
				System.out.println(salutatore.salutaNotte(name));
			}
			break;
			
		}
	}

}
