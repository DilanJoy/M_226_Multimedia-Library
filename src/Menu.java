import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	Filereader fr = new Filereader();
	String answer;
	String parameter;

	public void sectionQuestion() {
		System.out.println("Möchten Sie Bücher oder Filme anschauen.");
		answer = scan.nextLine();
		switch(answer){
		case "Bücher":
				switchToBooks();
				break;
		case "Filme":
				switchToMovies();
				break;
		default:
				System.out.println("Ungültige Antwort");
				break;
		
		}
	}

	private void switchToMovies() {
		Movies movie = new Movies();
		movie.startquestion();
	}

	private void switchToBooks() {
		Books book = new Books();
		book.startquestion();
	}
}
