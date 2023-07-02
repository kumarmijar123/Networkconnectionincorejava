package UDPPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientUDP {
     
	public ClientUDP() throws IOException {
		DatagramSocket soc = new DatagramSocket();
		
		//send request
		InetAddress address = InetAddress.getByName("localhost");
		byte[] data = new byte[256]; //0.256 kb
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 4445);//4445 is a port number
		soc.send(packet);
		
		//get response
		packet= new DatagramPacket(data, data.length);
		soc.receive(packet);
		
		//get response from packet
		String response= new String(packet.getData());
		System.out.println("Length of response: "+response.length());
		System.out.println("Response is: " + response);
		
	}
	public static void main(String[] args) throws IOException {
		
      new ClientUDP();
	}

}
