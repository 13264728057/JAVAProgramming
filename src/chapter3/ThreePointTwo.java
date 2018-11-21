package chapter3;

import java.util.Scanner;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class ThreePointTwo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入一个年份:");
      int a = scanner.nextInt();
      switch(a%12) {
         case 0:
            System.out.println("申猴");
            break;
         case 1:
            System.out.println("酉鸡");
            break;
         case 2:
            System.out.println("戌狗");
            break;
         case 3:
            System.out.println("亥猪");
            break;
         case 4:
            System.out.println("子鼠");
            break;
         case 5:
            System.out.println("丑牛");
            break;
         case 6:
            System.out.println("寅虎");
            break;
         case 7:
            System.out.println("卯兔");
            break;
         case 8:
            System.out.println("辰龙");
            break;
         case 9:
            System.out.println("巳蛇");
            break;
         case 10:
            System.out.println("午马");
            break;
         case 11:
            System.out.println("未羊");
            break;
      }
   }
}
