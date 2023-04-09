package sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {
    public static void main(String[] args) throws Exception {
        InetAddress destino = InetAddress.getLocalHost();
        int port = 12345;
        byte[] mensaje = new byte[1024];
        String saludo = "Enviando saludos";
        mensaje = saludo.getBytes();
        
        DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
        DatagramSocket socket = new DatagramSocket(34567);
        System.out.println("Enviando Datagrama de length: " + mensaje.length);
        System.out.println("IP Destino: " + destino.getHostAddress());
        System.out.println("Puerto local del socket: " + socket.getLocalPort());
        System.out.println("Puerto al que se envía: " + envio.getPort());
        
        socket.send(envio);
        socket.close();
    }
}
