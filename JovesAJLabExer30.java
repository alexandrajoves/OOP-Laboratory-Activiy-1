/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JovesAJLabActivity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer30 {
    public static void main(String[] args) throws IOException 
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String word1;
        String word2;
        
        System.out.println("Enter first word:");
        word1 = in.readLine();
        
        System.out.println("Enter second word:");
        word2 = in.readLine();
        
        System.out.println();
        System.out.print(word1);
        
        int dot = 30 - word1.length() - word2.length();
        
        for (int i = 0; i < dot; i++)
            System.out.print(".");
            System.out.println(word2);
        
        
  
}
}
