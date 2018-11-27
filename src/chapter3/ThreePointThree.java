package chapter3;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class ThreePointThree {
   public static void main(String[] args) {
      boolean t = true;
      boolean f = false;
      System.out.println((t || t) && f);
      System.out.println(t && t || t);
   }
}
