package Shangxuetang;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
//        //File file=new File("/Users/cwy/Desktop/途安房产文章图片.zip");//字符串'/'会被转义
//        File file1=new File("aaa.txt");
//        System.out.println("---"+file1.getAbsolutePath());
//        File file=new File("/Users/cwy/Desktop");
//        if(file.exists()){
//            file.delete();
//        }else
//            file.mkdirs();
//        String[] list=file.list();
//        for(String s:list){
//            System.out.println(s);
//        }
//        File[] files=file.listFiles();
//        //遍历
        File file=new File("/Users/cwy/Downloads");
        bianli(file);
        //递归遍历目录


    }
    public static void bianli(File f){
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file.getName());
            if(file.isDirectory()){
                bianli(file);
            }
        }
    }
}
