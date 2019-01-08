package chapter3;

import java.util.Scanner;

/**
 * @Auther: chenlong
 * @Date: 2019/1/7
 * @Description:-
 */
public class ThreePointFour {
   public static int[] sp(int num) {
      int[] sp = new int[3];
      sp[0] = num/100;
      sp[1] = num/10%10;
      sp[2] = num%10;
      return sp;
   }

   public static void main(String args[]) {
      System.out.println("请输入一个坐标,以空格分隔");
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if(Math.sqrt((a * a + b * b)) <= 10){
         System.out.println("在圆内");
      }else {
         System.out.println("不再圆内");
      }
   }
}
