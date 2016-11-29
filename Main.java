package com.Vakhovys;

import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException{
        File tmp = File.createTempFile("temp-cr","File");
        File pass = new File("D:\\Java\\Crypto\\src\\Crypto.txt");
        File file = new File("D:\\Java\\Crypto\\src\\1.txt");

        try(InputStream in = new BufferedInputStream(new FileInputStream(file));
            InputStream inCrypto = new BufferedInputStream(new FileInputStream(pass));
        OutputStream out  = new BufferedOutputStream(new FileOutputStream(tmp))){


            byte[] buf = new byte[1024];
            byte [] passs = new byte[1024];

            int len;
            while((len= in.read(buf))>-1){
                inCrypto.read(passs, 0 ,len);
                for(int i = 0; i<len;i++)
                    buf[i]^= passs[i];

                out.write(buf, 0 , len);
            }
            file.delete();
            tmp.renameTo(file);

        }




    }
}
