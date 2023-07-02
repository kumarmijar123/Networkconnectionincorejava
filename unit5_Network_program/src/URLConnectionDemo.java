import java.io.InputStream;
import java.net.URL;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://vedascollege.edu.np");
			java.net.URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();
			int i;
			while((i = stream.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception ex) {
			System.err.println(ex);
		}

	}

}
