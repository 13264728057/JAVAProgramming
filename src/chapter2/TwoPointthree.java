package chapter2;

import java.util.Scanner;

/**
 * @Auther: 陈龙
 * @Date: 2018/11/19
 * @Description:
 */
public class TwoPointthree {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入投资总额:");
      double amount = scanner.nextDouble();
      System.out.println("请输入年利率:");
      double rate = scanner.nextDouble();
      System.out.println("请输入年数:");
      double yesrs = scanner.nextDouble();
      double T = amount * Math.pow((1 + (rate/1200)),(yesrs * 12));
      System.out.println("总值是:" + T);
   }
}
