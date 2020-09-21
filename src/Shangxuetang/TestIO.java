package Shangxuetang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        //文件---->程序
        File file=new File("/Users/cwy/Desktop/途安房产文章图片.zip");
        //将文件接入到流内
        FileInputStream fileInputStream=new FileInputStream(file);
        //开始操作
        fileInputStream.read();
        byte[] b=new byte[8];
        int n=fileInputStream.read(b);
        while (n!=-1){
            System.out.println(n);
        }
        fileInputStream.close();
    }
}
