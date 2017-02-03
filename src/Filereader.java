
/*
 * Created by Dilan Joy Joseph on 11.11.2016
 * Description:
 * In dieser Klasse ist die Methode zum aus einem File lesen.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filereader {

	public List readfile(String filename) {
		List<String> list = new ArrayList<String>();
		// Mit einem BufferedReader wird das File eingelesen.
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			//Es wird Zeile für Zeile überprüft, ob die Zeile leer ist. Wenn nicht wird die Zeile der list hinzugefügt.
			for (String line; (line = br.readLine()) != null;) {
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
