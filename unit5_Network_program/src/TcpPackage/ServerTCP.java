package TcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerTCP {
	public ServerTCP() throws IOException {
		ServerSocket ss = new ServerSocket(3333);
		Socket soc = ss.accept();
		DataInputStream in = new DataInputStream(soc.getInputStream());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		
		//read  request
		String request = in. readUTF();
		System.out.println("Request is: " + request);
		out.writeUTF("Hi client i got your request");
		
		//close
		ss.close();
		soc.close();
		in.close();
		out.close();
	}

	public static void main(String[] args)throws UnknownHostException, IOException {
           
		new ServerTCP();

	}

}
