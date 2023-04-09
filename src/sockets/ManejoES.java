package sockets;

import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce texto");
        String cadena = scanner.nextLine();
        System.out.println("Introduce un carácter");
        char caracter = scanner.next().charAt(0);
        System.out.println("Introduce un int");
        int numero = scanner.nextInt();
        System.out.println("Introduce un decimal");
        double decimal = scanner.nextDouble();
        System.out.println("Introduce un valor booleano(true/false");
        boolean booleano = scanner.nextBoolean();
        
        System.out.println("El texto que has escrito es: " + cadena);
        System.out.println("El carácter que has escrito es: " + caracter);
        System.out.println("El número que has escrito es: " + numero);
        System.out.println("El decimal que has escrito es: " + decimal);
        System.out.println("El booleano que has escrito es: " + booleano);
        
        try {
            FileOutputStream ficheroSalida = new FileOutputStream("datos.dat");
            DataOutputStream outputStream = new DataOutputStream(ficheroSalida);
            
            outputStream.writeUTF(cadena);
            outputStream.writeChar(caracter);
            outputStream.writeInt(numero);
            outputStream.writeDouble(decimal);
            outputStream.writeBoolean(booleano);
            
            outputStream.flush();
            outputStream.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoES.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream ficheroEntrada = new FileInputStream("datos.dat");
            DataInputStream streamEntrada = new DataInputStream(ficheroEntrada);
            
            System.out.println("El texto que has escrito es: " + streamEntrada.readUTF());
            System.out.println("El carácter que has escrito es: " + streamEntrada.readChar());
            System.out.println("El número que has escrito es: " + streamEntrada.readInt());
            System.out.println("El decimal que has escrito es: " + streamEntrada.readDouble());
            System.out.println("El booleano que has escrito es: " + streamEntrada.readBoolean());
            
            streamEntrada.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
