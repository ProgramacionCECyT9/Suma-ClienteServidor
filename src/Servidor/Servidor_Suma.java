package Servidor;

import java.net.*;
import java.io.*;


public class Servidor_Suma {
   
   public static void main(String[] args) {
    	int x,y,suma;
    	String a,b;
    	ServerSocket ss = null;

    	try {
    		ss = new ServerSocket(5051);
    	} catch (IOException ioe){
    		System.out.println(ioe);
    	}

    	try {
    		System.out.println("En Espera De Un Numero");

    		Socket s1 = ss.accept();

    		InputStream is = s1.getInputStream();
    		DataInputStream dis= new DataInputStream(is);
    		a=dis.readUTF();

    		System.out.println("El numeor recibido es " + a);
    		System.out.println("En espera del segundo numero");

    		Socket s2 = ss.accept();

    		InputStream is2 = s2.getInputStream();
    		DataInputStream dis2= new DataInputStream(is2);
    		b=dis2.readUTF();


    		System.out.println("El numero recibido es " + b);

    		x = Integer.parseInt(a);
    		y = Integer.parseInt(b);
    		suma = x+y;

    		System.out.println("El resultado de la suma es " + suma);

    		s1.close();
    		s2.close();

    	} catch (IOException ioe2){
    		System.out.println(ioe2);
    	}
    } 
}
