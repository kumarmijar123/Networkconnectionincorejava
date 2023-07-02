import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) throws Exception {
		InetAddress ip;
		ip = InetAddress.getByName("www.youtube.com");
		System.out.println("HostName :" + ip.getHostName());
		System.out.println("Host  Address :" + ip.getHostAddress());
		System.out.println(InetAddress.getLocalHost());
				
		
		

	}

}
