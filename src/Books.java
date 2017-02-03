import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Books extends Multimedia {
	Scanner scan = new Scanner(System.in);
	String answer;

	public void startquestion() {
		System.out.println("Möchten Sie eine spezifische Suche starten? yes or no");
		answer = scan.nextLine();
		switch (answer) {
		case "yes":
			specificSearch("Books.txt");
			break;
		case "no":
			System.out.println("Sie werden zurück zum Menu gebracht.");
			Menu menu = new Menu();
			menu.sectionQuestion();
			break;
		default:
			System.out.println("Ungültige Eingabe.");
			startquestion();
			break;
		}
	}

	public void specificSearch(String filename) {
		String file = filename;
		Filereader fr = new Filereader();
		String[] list;

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			System.out.println("Titel oder Autor?");
			answer = scan.nextLine();
			int decider = 0;
			switch (answer) {
			case "Titel":
				decider = 0;
				break;
			case "Autor":
				decider = 1;
				break;
			default:
				System.out.println("Ungültige Eingabe");
				System.exit(1);
				break;
			}
			for (String line; (line = br.readLine()) != null;) {
				list = line.split(";");
				System.out.println(list[decider]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
