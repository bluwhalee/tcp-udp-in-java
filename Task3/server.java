import java.net.*;
import java.io.*;
import java.util.*;
public class server{
    public static void main(String[] args)throws Exception{
    	try{
        ServerSocket servicesocket= new ServerSocket(1500);
	while(true)
	{
        	Socket socket = servicesocket.accept(); 
		DataInputStream datastream = new DataInputStream(socket.getInputStream());
		String file_name=datastream.readUTF();
		if(file_name.equals("quit"))
		{
			break;
		}
		FileReader fileread=new FileReader(file_name);
		BufferedReader br=new BufferedReader(fileread);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		String l;
		System.out.println("Sending data to client");
		//loop
		while((l=br.readLine())!=null)  
		{
			dos.writeUTF(l);	
		}
		dos.writeUTF("leave");
		System.out.println("Data is sented!");
	
	}
	}
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
    }
}