import java.net.*;
import java.io.*;
import java.util.*;
public class server{
    public static void main(String[] args)throws Exception{
    	try{
        ServerSocket serversocket= new ServerSocket(1500);
        Socket socket = serversocket.accept(); 
        System.out.println("Client Connected...");
	DataInputStream datainputstm = new DataInputStream(socket.getInputStream());
	String l;
	String decrypt;
	ArrayList<String> Data=new ArrayList<String>();
	System.out.println("Receiving data from client...");
	System.out.println("Encrypted data:");
        while(!(l=datainputstm.readUTF()).equals("stop")){
		decrypt="";
			System.out.println(l);
        	for(int i=0; i<l.length(); i++){
          		decrypt += (char)(l.charAt(i)-10);
       		}
			
		Data.add(decrypt);
	}
	System.out.println("Data received");
	System.out.println("Sending back ");

	DataOutputStream dataoutputstm = new DataOutputStream(socket.getOutputStream());
	System.out.println("Decrypted data:");
	for(int i=0 ;i<Data.size();i++)
	{	
		System.out.println(Data.get(i));
		dataoutputstm.writeUTF(Data.get(i));
	}
	dataoutputstm.writeUTF("stop");
	System.out.println("Data is sent");
	}
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
    }
}