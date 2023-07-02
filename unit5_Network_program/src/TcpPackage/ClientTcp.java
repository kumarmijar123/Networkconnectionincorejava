package TcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTcp {

	public ClientTcp() throws UnknownHostException, IOException {
		   //open connection at port 1245
		   Socket soc = new Socket("localhost", 3333);
		   
		   //Check responses in socket
		   DataInputStream in = new DataInputStream(soc.getInputStream());
		   
		   //send request to the server
		   DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		   
		   //IO operation performing
		   out.writeUTF("Hello Server");
		   
		   //we read data from socket
		   String response = in.readUTF();
		   System.out.println("Response=" + response);
		   soc.close();
		   in.close();
		   out.close();
	   }

	public static void main(String[] args) throws UnknownHostException, IOException {
		new ClientTcp();

	}

}
