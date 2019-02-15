package chapter4;

import java.util.Random;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class FourPoint6 {
   public static void main(String[] args){
      Random angle = new Random();
      double angle1 = angle.nextDouble() * 360;
      double angle2 = angle.nextDouble() * 360;
      double angle3 = angle.nextDouble() * 360;
      double x1 = 40 * Math.cos(angle1);
      double y1 = 40 * Math.sin(angle1);
      double x2 = 40 * Math.cos(angle2);
      double y2 = 40 * Math.sin(angle2);
      double x3 = 40 * Math.cos(angle3);
      double y3 = 40 * Math.sin(angle3);
      double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
      double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
      double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
      double angleA = Math.acos((a * a + b * b - c * c)/(2 * a * b));
      double angleB = Math.acos((a * a + c * c - b * b)/(2 * a * c));
      double angleC = Math.acos((c * c + b * b - a * a)/(2 * c * b));
      System.out.println(angleA);
      System.out.println(angleB);
      System.out.println(angleC);
   }
}
