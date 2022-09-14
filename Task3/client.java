import java.net.*;
import java.io.*;
import java.util.*;
public class client{
    public static void main(String[] args) throws Exception{
        try{
		int port=1500;
		Socket socket = new Socket("localhost",port);
		System.out.println("connented to port: "+port);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String filename= sc.nextLine();
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(filename);
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String d;
		System.out.println("Received data from server.");
		while(!(d=dis.readUTF()).equals("leave")){
			System.out.println(d);
		}
	 	socket.close();
       }
	catch(Exception exp){
        System.out.println("Error: Something went wrong" + exp.getMessage());
    }
       
        
    }
}