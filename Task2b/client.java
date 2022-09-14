import java.net.*;
import java.io.*;
import java.util.*;
public class client{
    public static void main(String[] args)throws Exception{
        try{
		int port=1500;
		Socket socket = new Socket("127.0.0.1",port);
		System.out.println("connented to port: "+port);
		FileReader fileread=new FileReader("file.txt");
		BufferedReader bufferread=new BufferedReader(fileread);
		DataOutputStream dataoutputstm = new DataOutputStream(socket.getOutputStream());
		String l;
		String encrypt;
		while((l=bufferread.readLine())!=null)  
		{
			encrypt="";
        		for(int i=0; i<l.length(); i++){
          			encrypt += (char)(l.charAt(i)+10);
       			}
			dataoutputstm.writeUTF(encrypt);	
		}
		dataoutputstm.writeUTF("stop");
		
		System.out.println("Receiving data");
		DataInputStream datainputstm = new DataInputStream(socket.getInputStream());
		while(!(l=datainputstm.readUTF()).equals("stop")){
			System.out.println(l);
		}
		System.out.println("Data is received");
	 	socket.close();
       }
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
       
        
    }
}