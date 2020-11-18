package com.huron.server;

import java.io.*;
import java.net.*;


//the server will create a thread, which is light
public class Server extends Thread{
    private ServerSocket serverSocket;

    public Server(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000000);
    }


    @Override
    public void run() {
       while(true){
           try{
               System.out.println("Waiting for client on port" + serverSocket.getLocalPort() +"...");

               //create server socket when client tends to connect
               Socket server = serverSocket.accept();
               System.out.println("Just connected to " + server.getRemoteSocketAddress());

               DataInputStream in  = new DataInputStream(server.getInputStream());
               System.out.println(in.readUTF());

               DataOutputStream out = new DataOutputStream(server.getOutputStream());
               out.writeUTF("Hello,here is huron's web!");
               out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");

               /*close the socket and release resources*/
               server.close();
           }catch (SocketTimeoutException s){
               System.out.println("Socket timed out!");
               break;
           }catch (IOException e){
               e.printStackTrace();
               break;
           }
       }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);

        try{
            Thread t = new Server(port);
            t.start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
