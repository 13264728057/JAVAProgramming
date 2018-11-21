package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class cs {
   private cs1 cs1;
   int x = 1;
   protected cs1 y;
   public static final Map<String,String> i = new HashMap<>();

   static {
      i.put("fuck","sb");
   }

   public cs1 getCs1() {
//      if(cs1 == null) {
//         return new cs1();
//      }
      i.put("fuck2","sb2");
      return cs1;
   }

   public void setCs1(cs1 cs1) {
      this.cs1 = cs1;
   }
}
