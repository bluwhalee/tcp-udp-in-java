import java.net.*;
import java.io.*;
import java.util.*;
public class client{
    public static void main(String args[]){
        try{
		int port=1500;
		Socket socket = new Socket("127.0.0.1",port);
		System.out.println("connented to port: "+port);
		FileReader fileread=new FileReader("file.txt");
		BufferedReader buffer_reader=new BufferedReader(fileread);
		DataOutputStream dataout = new DataOutputStream(socket.getOutputStream());
		String s;
		while((s=buffer_reader.readLine())!=null)  
		{
			dataout.writeUTF(s);
		}
		//end chat codeword between client and server
		dataout.writeUTF("leavemealone");
	 	socket.close();
       }
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
       
        
    }
}