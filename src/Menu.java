import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	Filereader fr = new Filereader();
	String answer;
	String parameter;

	public void sectionQuestion() {
		System.out.println("M�chten Sie B�cher oder Filme anschauen.");
		answer = scan.nextLine();
		if (answer == "B�cher") {
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
