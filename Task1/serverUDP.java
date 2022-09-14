import java.io.*;
import java.net.*;

public class serverUDP{
public static void main(String args[]){
	try{
		DatagramSocket datasocket=new DatagramSocket(1500);
		byte b[]=new byte[100];
		
		//datagram get packet in byte 
		DatagramPacket datapacket=new DatagramPacket(b,b.length);
		datasocket.receive(datapacket);
		System.out.println("Ahmad");
	}
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
}
}
