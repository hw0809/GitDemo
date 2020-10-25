package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

    final void methoda() {}



    public static void main(String[] args) {
       // int a = Integer.parseInt("12");
        //int b = Integer.valueOf("12").intValue();

        //int a[][] = new int[][];
        //int b[10][10] = new int [][];


        int c[][] = new int[10][10];
        int [][] d = new int[10][10];
        int [] e[] = new int[10][10];

        //Map map = new Hashtable();
        Map map = new HashMap();
        map.put(null, "1");
        map.put("17" , null);

//        File file = new File("D://test");
//        //file.canRead();
//
//        String content = "hello";
//        //stream.write(content.getBytes());
//        //.close();
//        try {
//            FileOutputStream stream = new FileOutputStream(file);
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }

//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
//        System.out.println(format.format(date));
        // file.mkdir();

//        int [][] arr =new int[][]{{1},{2,3,4},{5,6}};
//        System.out.println(arr[1][1]);

          StringBuffer sb = new StringBuffer();
          sb.append("45345");

          StringBuilder builder = new StringBuilder();
          builder.append("1231");

        List list = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(9);
        Executors.newCachedThreadPool();
        //Executors.newScheduledThreadPool();
        //ThreadPoolExecutor executor = new ThreadPoolExecutor()
    }
}
