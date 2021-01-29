package objectmethod4;

public class SalutatoreFormale implements ISalutatore {


	@Override
	public String salutaMattino(String name) {
		// TODO Auto-generated method stub
		return "Buongiorno, "+ name;
	}

	@Override
	public String salutaSera(String name) {
		// TODO Auto-generated method stub
		return "Buonasera, "+ name;
	}

	@Override
	public String salutaNotte(String name) {
		// TODO Auto-generated method stub
		return "Buonanotte, " + name;
	}
}

