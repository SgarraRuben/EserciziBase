package objectmethod4;

public class SalutatoreInformale implements ISalutatore{

	@Override
	public String salutaMattino(String name) {
		// TODO Auto-generated method stub
		return "Buongiornissimo, " + name;
	}

	@Override
	public String salutaSera(String name) {
		// TODO Auto-generated method stub
		return "Fai serata?, " + name;
	}

	@Override
	public String salutaNotte(String name) {
		// TODO Auto-generated method stub
		return "Notte notte, " + name;
	}

}
