import java.awt.SecondaryLoop;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Multimedia {

	Filereader fr = new Filereader();

	public void list(String filename) {
		String file = filename;
		System.out.print(fr.readfile(file));

	}

	public void startquestion(String filename) {
		String answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("Möchten Sie eine spezifische Suche starten? yes or no");
		answer = scan.nextLine();
		switch (answer) {
		case "yes":
			specificSearch(filename);
			break;
		case "no":
			System.out.println("Sie werden zurück zum Menu weitergeleitet.");
			Menu menu = new Menu();
			menu.sectionQuestion();
			break;
		default:
			System.out.println("Ungültige Eingabe.");
			startquestion(filename);
			break;
		}
	}

	public void specificSearch(String filename) {
		String file = filename;
		Filereader fr = new Filereader();
		String[] list;
		String answer;
		Scanner scan = new Scanner(System.in);
		String searchquestion = null;
		String secondvalue = null;
		switch (filename) {
		case "Books.txt":
			searchquestion = "Titel oder Autor?";
			break;
		case "Movies.txt":
			searchquestion = "Titel oder Regisseur?";
			break;
		default:
			System.out.println("Ungültiges File ausgewählt.");
			System.exit(1);

		}

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			System.out.println(searchquestion);
			answer = scan.nextLine();
			int decider = 0;
			switch (answer) {
			case "Titel":
				decider = 0;
				break;
			case "Autor":
				decider = 1;
				break;
			case "Regisseur":
				decider = 1;
				break;
			default:
				System.out.println("Ungültige Eingabe");
				System.exit(1);
			}
			for (

			String line; (line = br.readLine()) != null;) {
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
