package chapter3;

import java.util.Scanner;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class ThreePoint21 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("请输入年份:");
      int year = scanner.nextInt();
      System.out.print("请输入月份:");
      int month = scanner.nextInt();
      System.out.println("请输入天数：");
      int day = scanner.nextInt();
      if(month == 1 || month == 2) {
         month = month + 12;
         year = year - 1;
      }
      int j = year/100;
      int k = year%100;
      int h = (day + 26 * (month + 1)/10 + k + k/4 + j/4 + 5 * j)%7;
      System.out.println(h);//0为星期六，1为星期天，2为星期一，3为星期二，4为星期三，5为星期四，6为星期五
   }
}
