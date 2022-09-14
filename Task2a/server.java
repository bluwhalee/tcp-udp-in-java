import java.net.*;
import java.io.*;
import java.util.*;
public class server
{
    public static void main(String[] args)throws Exception{
    	try{
        ServerSocket serversocket= new ServerSocket(1500);
        System.out.println("Waiting for Client request");
        Socket socket = serversocket.accept(); 
        System.out.println("Client Connected");
	DataInputStream datastream = new DataInputStream(socket.getInputStream());
	String data;
	int i=1;
	//end chat codeword between client and server
        while(!(data=datastream.readUTF()).equals("leavemealone")){
		System.out.println("line " +i+" read");
		i++;
	}
	}	
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
    }
}