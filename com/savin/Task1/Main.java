package com.savin.Task1;

/**
 * Created with IntelliJ IDEA.
 * User: acer
 * Date: 30.01.13
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException {
        byte a[]=new byte[12];
        String s;
        int cnt;
        for (;;){
            cnt=System.in.read(a);
            s=new String(a,0,cnt,System.getProperty("file.encoding"));
            System.out.println(s);
        }
    }
}
