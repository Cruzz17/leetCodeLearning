package Shangxuetang;

import java.io.*;
/*
文件字节流
 */
public class TestIO03 {
    public static void main(String[] args) throws IOException {
        File f=new File("/Users/cwy/Desktop/途安房产文章图片.zip");
        File file=new File("");
        FileInputStream fileInputStream=new FileInputStream(f);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
//        int n=fileInputStream.read();
//        while (n!=-1){
//            fileOutputStream.write(n);
//            n=fileInputStream.read();
//        }
        byte[] b=new byte[6];//通过缓存的数组进行存储
        int len=fileInputStream.read(b);
        while (len!=-1){
            fileOutputStream.write(b,0,len);//有效的字节区间
            len=fileInputStream.read(b);

        }
        fileOutputStream.close();
    }
}
