package com.VakhovYS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by nexxie on 30.11.2016.
 */
public class appendFile {

    public static void appendFile(String path, File dest) throws IOException {
        try (FileOutputStream out = new FileOutputStream(dest)) {

            File fl = new File(path);

            File cutFiles[] = fl.listFiles();

            for (int i = 0; i < cutFiles.length; i++) {
                FileInputStream in = new FileInputStream(cutFiles[i]);
                byte[] buf = new byte[(int) cutFiles[i].length()];
                in.read(buf);
                out.write(buf);

            }

        }
    }
}
