package objectmethod2;

import java.util.ArrayList;

import prog.io.ConsoleInputManager;

public class ReadMaxQuantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInputManager in =new ConsoleInputManager();
		Article[] articleArray = new Article[3];
		ArrayList<Article> outputList=new ArrayList<Article>();
		for(int i=0; i< articleArray.length; i++) {
			int id=i+1;
			String code = in.readLine("inserisci codice> ");
			String description = in.readLine("inserisci descrizione> ");
			int quantity = in.readInt("inserisci una quantità> ");
			Article article=new Article(id++, code, description, quantity);
			outputList.add(article);
		}
		System.out.println(outputList.toString());
		int qtMax=0;
		for (Article article : outputList) {
			if(article.getQuantity() > qtMax) {
				qtMax=article.getQuantity();
			}

		}
		for (Article article : outputList) {
			if(article.getQuantity() == qtMax) {
				System.out.println(article.toString());
				break;

			}
		}
	}

}
