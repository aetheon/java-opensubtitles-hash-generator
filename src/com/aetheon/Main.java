package com.aetheon;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: oscar
 * Date: 29-06-2013
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        try {
            String filename = args[0];
            String hash = OpenSubtitlesHasher.computeHash(new File(filename));
            System.out.println(hash);
        } catch (IOException e) {
        }

    }
}
