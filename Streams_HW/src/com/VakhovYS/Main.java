package com.VakhovYS;

import java.io.File;
import java.io.IOException;

import static com.VakhovYS.Partiton.partitonFile;
import static com.VakhovYS.appendFile.appendFile;

public class Main {

    public static void main(String[] args)throws IOException {
        File appended = new File("D:\\IdeaProjects\\Streams_HW\\src\\appended.txt");
        File dst = new File("D:\\IdeaProjects\\Streams_HW\\src\\all.txt");
        String path = "D:\\IdeaProjects\\Streams_HW\\src";

        partitonFile(dst, 1024, path);
        appendFile(path,appended);


    }
}
