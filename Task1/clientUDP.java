import java.io.*;
import java.net.*;
import java.util.*;

public class clientUDP{
public static void main(String args[]){
	try{
                Scanner obj = new Scanner(System.in);
                System.out.println("Roll Number: ");
                String name = obj.nextLine();
		DatagramSocket ds=new DatagramSocket();
		
                byte b[] = name.getBytes();
		DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),1500);
		ds.send(dp);

	}
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
}
}
