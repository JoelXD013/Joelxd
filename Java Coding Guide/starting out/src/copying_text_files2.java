import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copying_text_files2 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		in  = new FileInputStream("C:\\Users\\brian\\OneDrive\\Documents\\GitHub\\Joelxd\\Java Coding Guide\\starting out\\src\\input.txt");
		out = new FileOutputStream("C:\\Users\\brian\\OneDrive\\Documents\\GitHub\\Joelxd\\Java Coding Guide\\starting out\\src\\output.txt");
			
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		
		if (in != null)
			in.close();
		
		if (in != null)
			out.close();
	}
	
}
