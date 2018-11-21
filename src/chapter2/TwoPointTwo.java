package chapter2;

import java.util.Scanner;

/**
 * @Auther: 陈龙
 * @Date: 2018/11/12
 * @Description：我们的时区是+8时区，所以利用System.currentTimeMills得出的小时数会少8
 * X1 op= X2 为 X1 = (T)X1 op X2 T为X1类型
 */
public class TwoPointTwo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入您所在的时区：");
      int a = scanner.nextInt();
      long totalMilliSeconds = System.currentTimeMillis();
      long nowMilliSeconds = totalMilliSeconds%1000;
      long totalSeconds = totalMilliSeconds/1000;
      long nowSeconds = totalSeconds%60;
      long totalMinutes = totalSeconds/60;
      long nowMinutes = totalMinutes%60;
      long totalHours = totalMinutes/60;
      long nowHours = totalHours%24;
      System.out.println("现在是:" + (nowHours + a) + ":" + nowMinutes + ":" + nowSeconds + ":" + nowMilliSeconds);
   }
}
