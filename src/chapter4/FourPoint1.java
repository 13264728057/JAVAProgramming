package chapter4;

import java.util.Scanner;

/**
 * @Auther: chenlong262
 * @Date:2019/2/15
 * @Description:字符串+数字就连接，字符+数字则进行计算 程序为计算亮点之间间距
 */
public class FourPoint1 {
   public static void main(String[] args) {
      System.out.println("请输入第一个坐标：");
      Scanner scanner = new Scanner(System.in);
      double x1 = Math.toRadians(scanner.nextDouble());
      double y1 = Math.toRadians(scanner.nextDouble());
      System.out.println("请输入第二个坐标：");
      double x2 = Math.toRadians(scanner.nextDouble());
      double y2 = Math.toRadians(scanner.nextDouble());
      double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

      System.out.print("距离为：" + d + "KM");
   }
}
