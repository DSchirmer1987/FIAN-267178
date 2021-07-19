package junit.data;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class VCard {
	public String formattedName;
	public String email;
	
	public VCard(String name, String email) {
		this.formattedName = name;
		this.email = email;
	}
	
	public void export(String filename) {
		Writer writer;
		try {
			writer = Files.newBufferedWriter(Paths.get(filename));
			writer.write(toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("BEGIN:VCARD\n");
		if(formattedName != null | !formattedName.isEmpty()) {
			result.append("FN:").append(formattedName).append("\n");
		}
		if(email != null | !email.isEmpty()) {
			result.append("EMAIL:").append(email).append("\n");
		}
		result.append("END:VCARD");
		return result.toString();
	}
}
