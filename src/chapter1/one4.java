package chapter1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class one4 {
   private static String path = "E:\\java-text\\";

   /**
    * @Auther: chenlong
    * @Date: 2018/8/30
    * @param: FileName 要创建的文件名
    * @param: FilePath 要创建的文件的存储路径 基于E盘（暂留）
    * @Description: 创建指定文件名与地址的文件
    */
   public static void writeFile(String FileName, String File) throws IOException {
      String FilePath = path + FileName + ".txt";
      File newfile = new File(FilePath);

      if (!newfile.exists()) {
         newfile.createNewFile();
         System.out.println("success creat file");
      }else {
         System.out.println("the file " + FileName + ".txt has already exists");
      }

      PrintWriter write = new PrintWriter(newfile);
      write.print(File);
      write.close();
   }

   public static void main(String args[]) {
      try {
         writeFile("fuckyou", "no");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}