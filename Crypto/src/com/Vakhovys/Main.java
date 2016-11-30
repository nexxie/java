package com.Vakhovys;

import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException{
        File Crypted = new File("D:\\Java\\Crypto\\src\\Crypted.txt");
        File pass = new File("D:\\Java\\Crypto\\src\\Crypto.txt");
        File file = new File("D:\\Java\\Crypto\\src\\1.txt");

        try(InputStream in = new BufferedInputStream(new FileInputStream(file));
            InputStream inCrypto = new BufferedInputStream(new FileInputStream(pass));
        OutputStream out  = new BufferedOutputStream(new FileOutputStream(Crypted))){


            byte[] buf = new byte[1024];
            int len;
            int lenPass = (int) pass.length();
            byte[] passs = new byte[lenPass];
            inCrypto.read(passs, 0 ,lenPass);

            while((len= in.read(buf))>-1) {
                for (int i = 0, j = 0; i < len; i++, j++){
                    if (j == passs.length) j = 0;
                buf[i] ^= passs[j];
            }
                out.write(buf, 0 , len);
            }
        }




    }
}
