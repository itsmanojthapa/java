package com.reverseecho.MutliClient;

import java.net.*;
import java.io.*;

public class ServerUsingMultiThreadSocket extends Thread {

    Socket stk;

    public  ServerUsingMultiThreadSocket(Socket st){
        stk = st;
    }

    public void run(){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do {
                msg = br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);

            } while (!msg.equals("dne"));


        }catch (Exception e){}


    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);

        int count = 1;
        Socket stk ;
        ServerUsingMultiThreadSocket re;

        do {

            stk =  ss.accept();
            System.out.println("Client Connected : "+ count++);
            re = new ServerUsingMultiThreadSocket(stk);
            re.start();

        }while(true);


    }
}

class ClientUsingSocket{

    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 2000);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("fron server : " + msg);
        } while (!msg.equals("dne"));
        stk.close();

    }
}
