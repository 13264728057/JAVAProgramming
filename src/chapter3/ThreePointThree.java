package chapter3;

import java.util.Scanner;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class ThreePointThree {
   public static void main(String[] args) {
      System.out.println("ax + by = e");
      System.out.println("cx + dy = f");
      System.out.println("请输入a,b,c,d,e,f的值:");
      Scanner scanner = new Scanner(System.in);
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
      double d = scanner.nextDouble();
      double e = scanner.nextDouble();
      double f = scanner.nextDouble();
      double g = a * d - b * c;
      if(g != 0) {
         System.out.println("x = " + (e * d - b * f)/g + "y = " + (a * f - e * c)/g);
      }else{
         System.out.println("无解");
      }
   }
}
