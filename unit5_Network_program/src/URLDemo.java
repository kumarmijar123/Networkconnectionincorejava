import java.net.URL;

public class URLDemo {
	
	

	public static void main(String[] args) {
		try {
		
           //Url
		   URL url = new URL("https://tutorials.jenkov.com/java-networking/udp-datagram-sockets.html");
		   
		   
		   
		   //Informations
		   System.out.println("Protocol:" + url.getProtocol()); //
		  System.out.println("Hostname:" +url.getHost()); //
		   
		  System.out.println("Portnumber:" + url.getPort()); //
		  System.out.println("Filename:" + url.getFile()); //
		   
		   
		
	}catch(Exception ex) {
		System.err.println(ex);
	}

}
}
