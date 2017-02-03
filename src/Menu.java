import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	Filereader fr = new Filereader();
	String answer;
	String parameter;

	public void sectionQuestion() {
		System.out.println("Möchten Sie Bücher oder Filme anschauen.");
		answer = scan.nextLine();
		if (answer == "Bücher") {
			switchToBooks();
		} else if (answer == "Filme") {
			switchToMovies();
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
