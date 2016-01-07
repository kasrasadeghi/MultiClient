/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiclient;

import java.net.Socket;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author Sarah M
 */
public class MultiClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            short port = 8080;
            Socket socket = new Socket("localhost",port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            
            String readline;
            while ((readline = in.nextLine()) != null) {
                System.out.println(readline);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
