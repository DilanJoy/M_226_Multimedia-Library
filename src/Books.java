import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Books extends Multimedia {
	Scanner scan = new Scanner(System.in);
	String answer;

	public void startquestion() {
		super.startquestion("Books.txt");
	}
	
	public void specificSearch(){
		super.specificSearch("Books.txt");
	}
}
