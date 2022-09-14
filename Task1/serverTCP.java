import java.net.*;
import java.io.*;

public class serverTCP{
    public static void main(String[] args)throws IOException{
        try{
        ServerSocket servicesocket= new ServerSocket(1500);
        Socket socket = servicesocket.accept(); 
        System.out.println("Ahmad");
        }
        catch(Exception exp){
        System.out.println("Error: Something went wrong" + exp.getMessage());
    }
    }
}