package com.sd.io;

class FileRead {
    public static void main(String args[]) throws Exception {
        FileReader fr=new FileReader("test.txt");
        int i;
        while((i=fr.read()) !=-1)
            System.out.println((char)i);
        fr.close();
    }
}