package chapter3;

/**
 * @Auther: chenlong
 * @Date: 2019/1/7
 * @Description:-
 */
public class ThreePointFour {
   public static void main(String args[]) {
      int i = (int)(Math.random() * 12) + 1;//[0,1)
      System.out.println(i);
      switch (i) {
         case 1:
            System.out.println("Junuary");
            break;
         case 2:
            System.out.println("February");
            break;
         case 3:
            System.out.println("March");
            break;
         case 4:
            System.out.println("April");
            break;
         case 5:
            System.out.println("May");
            break;
         case 6:
            System.out.println("June");
            break;
         case 7:
            System.out.println("July");
            break;
         case 8:
            System.out.println("August");
            break;
         case 9:
            System.out.println("September");
            break;
         case 10:
            System.out.println("October");
            break;
         case 11:
            System.out.println("November");
            break;
         case 12:
            System.out.println("December");
            break;
      }
   }
}
