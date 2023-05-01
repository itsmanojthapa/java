package com.reverseecho;

import java.net.*;
import java.io.*;

public class ServerUsingSocket {

    public static void main(String[] args) throws Exception {
        // write your code here
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

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
        ss.close();

    }
}

class ClientUsingSocket {

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
