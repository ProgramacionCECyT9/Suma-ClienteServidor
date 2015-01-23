package Cliente;

import java.net.*;
import java.io.*;

public class Cilente_Suma {
    
    public static void main(String[] args) {
    	
    	String cad1,cad2;

    	try{

    		Socket sc1 = new Socket("localhost",5051);
                Socket sc2 = new Socket("localhost",5051);
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
                
    		OutputStream os1 = sc1.getOutputStream();
    		DataOutputStream dos1 = new DataOutputStream(os1);
    		System.out.println("Pulsa Un Numero Para Enviarlo Al Servidor");
    		cad1 = br.readLine();
    		dos1.writeUTF(cad1);
                
                OutputStream os2 = sc2.getOutputStream();
    		DataOutputStream dos2 = new DataOutputStream(os2);
    		System.out.println("Pulsa Otro Numero Para Enviarlo Al Servidor");
    		cad2 = br.readLine();
    		dos2.writeUTF(cad2);
                
    		dos1.close();
    		sc2.close();
    		dos2.close();
    		sc1.close();
                

    	} catch (IOException ioe){
    		System.out.println(ioe);
    	}
    }
}
