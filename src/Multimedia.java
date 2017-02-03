import java.util.List;

public class Multimedia {
	
	Filereader fr = new Filereader();
	
	public void list(String filename){
		String file = filename;
		System.out.print(fr.readfile(file));
		
	}
}
