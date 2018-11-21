package chapter3;

import java.util.Scanner;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:double值的校验，两值差在10的负14次方则可认为近似相等，float为10的负7次方
 *
 */
public class ThreePointOne {
   public static void main(String[] args) {
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);

      if(number1 < number2) { //异或交换两数的值
         number1 = number1 ^ number2;
         number2 = number1 ^ number2;
         number1 = number1 ^ number2;
      }
      Scanner scanner = new Scanner(System.in);
      System.out.println(number1 + "-" + number2 + "=?");
      int a = scanner.nextInt();
      System.out.println((number1 - number2) == a);
   }
}
