package Shangxuetang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class TestIO2 {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/cwy/Desktop/途安房产文章图片.zip");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        String string="abcdsadas ";
        byte [] b=string.getBytes();//得使用byte的数组才能将流传入文件内
        for(byte b1:b){
            fileOutputStream.write(b1);
        }
        fileOutputStream.close();
    }
}
