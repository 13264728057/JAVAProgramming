package chapter3;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class ThreePoint24 {
   public static String King(int i) {
      switch (i) {
         case 1:
            return "Ace";
         case 11:
            return "Jack";
         case 12:
            return "Queen";
         case 13:
            return "King";
         default:
            return String.valueOf(i);
      }
   }

   public static String Clubs(int i) {
      switch (i) {
         case 1:
            return "Clubs";
         case 2:
            return "Diamonds";
         case 3:
            return "Hearts";
         case 4:
            return "Spades";
         default:
            return "error";
      }
   }

   public static void main(String[] args) {
      int i = (int)(Math.random() * 13 + 1);
      int j = (int)(Math.random() * 4 + 1);
      System.out.println("你选的是" + Clubs(j) + " " + King(i));
   }
}
