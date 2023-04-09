package sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];
        DatagramSocket socket = new DatagramSocket(12345);
        
        System.out.println("Esperando Datagrama...");
        DatagramPacket recibo = new DatagramPacket(buffer, buffer.length);
        socket.receive(recibo);
        
        int bytesRec = recibo.getLength();
        String paquete = new String(recibo.getData());
        
        System.out.println("Número bytes recibidos: " + bytesRec);
        System.out.println("Contenido del paquete: " + paquete.trim());
        System.out.println("Puerto origen: " + recibo.getPort());
        System.out.println("IP origen: " + recibo.getAddress().getHostAddress());
        System.out.println("Puerto destino: " + socket.getLocalPort());

        socket.close();
    }
}
