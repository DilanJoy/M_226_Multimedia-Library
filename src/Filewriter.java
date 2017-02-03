
/*
 * Created by Dilan Joy Joseph on 11.11.2016
 * Description:
 * Hier ist die Methode zum in Files schreiben.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {
	
	public void writeFile(String filename, String content) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(filename, true));
			writer.write(content); //Hier wird mit dem BufferedWriter und der write() Methode der Content ins File gschrieben.
			writer.write("\n");//Ein Absatz wird hinzugefügt, damit der neue Content auf einer neuen Zeile ist.
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
