package com.VakhovYS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by nexxie on 30.11.2016.
 */
public class Partiton {

    public static void partitonFile(File src, Integer size, String path)throws IOException{
        try(FileInputStream in = new FileInputStream(src)){

            byte buf[] = new byte[size];

            int len;
            int i =1;

            while((len = in.read())>-1){
                FileOutputStream out = new FileOutputStream(new StringBuffer().append(path).append("cut").append(i).append(".txt").toString());
                out.write(buf, 0 , len);
                i++;
            }

        }
    }

}
