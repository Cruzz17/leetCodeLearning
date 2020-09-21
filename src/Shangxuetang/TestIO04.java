package Shangxuetang;

import java.io.*;

/*
文件字符流，用流的时候要记得抛出异常，并且处理
 */
public class TestIO04 {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/cwy/Desktop/途安房产文章图片.zip");
        File file1=new File("/Users/cwy/Desktop/途安房产文章图片1.zip");
        FileReader fileReader=new FileReader(file);
        FileWriter fileWriter=new FileWriter(file1);
        int n= fileReader.read();
        while (n!=-1){
            fileWriter.write(n);
            n=fileReader.read();
        }
        //字符流必须要刷新
//        fileWriter.flush();
        fileWriter.close();
        fileReader.close();

    }
}
