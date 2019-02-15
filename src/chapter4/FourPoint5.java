package chapter4;

import java.util.Scanner;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class FourPoint5 {
   public static void main(String[] args){
      System.out.print("Enter the number of sides:");
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      System.out.println("Enter the side:");
      double s = scanner.nextDouble();
      double area = n * s * s/(4 * Math.tan(Math.PI/n));
      System.out.println(n + "side area: " + area);
   }
}
