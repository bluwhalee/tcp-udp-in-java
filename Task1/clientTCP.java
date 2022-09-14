import java.io.*;
import java.net.*;
import java.util.*;

public class clientTCP{
    public static void main(String[] args) throws Exception{
        try{
		
                Scanner obj = new Scanner(System.in);
                System.out.println("Roll Number: ");
                String name = obj.nextLine();
		Socket socket = new Socket("127.0.0.1",1500);
		 socket.close();
       }
	catch(Exception exp){
		System.out.println("Error: Something went wrong" + exp.getMessage());
	}
       
        
    }
}