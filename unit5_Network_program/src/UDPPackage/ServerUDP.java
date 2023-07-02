package UDPPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerUDP {
	public ServerUDP() throws IOException {
		byte[] data = new byte[256];
		DatagramSocket soc = new DatagramSocket(4445);
		
		//receive request
		DatagramPacket packet = new DatagramPacket(data, data.length);
		soc.receive(packet); //from the client
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		
		String response = "Hello client, I am a server";
		data = response.getBytes();
		
		//send response to the client
		packet = new DatagramPacket(data, data.length, address, port);
		soc.send(packet); //to the client
		soc.close();
	}

	public static void main(String[] args) throws IOException {
		new ServerUDP();

	}

}
