package objectmethod3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;

import prog.io.ConsoleInputManager;

public class ArticleFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		ConsoleInputManager in = new ConsoleInputManager();
		//ArrayList<Article> articleArray=new ArrayList<Article>();
		HashMap<String,Article> articleMap = new HashMap<String,Article>();
		FileReader frd = new FileReader("articoli.csv");

		BufferedReader bfr =new BufferedReader(frd);
		//int i;
		String csvLine;
		//while((i=frd.read()) !=-1)
		//System.out.print((char)i);
		while((csvLine = bfr.readLine())!=null) {
			String[] tmp = csvLine.split(";");
			Article article = new Article(Integer.parseInt(tmp[0]), tmp[1], tmp[2], Integer.parseInt(tmp[3]));
			articleMap.put(tmp[1],article);
		}
		frd.close();
		bfr.close();
		int id = 0;
		boolean goforward = true;
		do {
			for ( Entry<String, Article> articleElement : articleMap.entrySet()) {
				if(articleElement.getValue().getId() > id) {
					id = articleElement.getValue().getId();
				}
			}

			String code = in.readLine("inserisci codice> ");
			String description = in.readLine("inserisci descrizione> ");
			int quantity = in.readInt("inserisci una quantità> ");
			Article article = new Article(id+1, code, description, quantity);
			articleMap.put(article.getCode(), article);
			goforward = in.readSiNo("vuoi inserire un articolo? ");
		}while(goforward);

		System.out.println(articleMap.toString());
		String inputCode = in.readLine("inserisci codice articolo? ");

		Article result = articleMap.get(inputCode.toUpperCase());
		System.out.println(result.toString());

		String nextLine = System.getProperty("line.separator");

		try {
			Writer writer = new FileWriter("nuovi-articoli.csv");
			for (Entry<String, Article> entry : articleMap.entrySet()) {
				writer.append(String.valueOf(entry.getValue().getId()))
				.append(';')
				.append(String.valueOf(entry.getValue().getCode()))
				.append(';')
				.append(String.valueOf(entry.getValue().getDescription()))
				.append(';')
				.append(String.valueOf(entry.getValue().getQuantity()))
				.append(nextLine);
			}
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		}
	}

}


