package chapter4;

/**
 * @Auther: ${user}
 * @Date: ${date} ${hour}:${minute}
 * @Description:
 */
public class FourPoint3 {
   public static void main(String[] args){
      final double x1 = Math.toRadians(33.46);//atlanta
      final double y1 = Math.toRadians(84.25);//atlanta
      final double x2 = Math.toRadians(28.3);//orlando
      final double y2 = Math.toRadians(81.22);//orlando
      final double x3 = Math.toRadians(32.1);//savannah
      final double y3 = Math.toRadians(81.7);//savannah
      final double x4 = Math.toRadians(35.13);//charlotte
      final double y4 = Math.toRadians(80.5);//charlotte
      double d1 = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
      double d2 = 6371.01 * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
      double d3 = 6371.01 * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
      double d4 = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
      double d5 = 6371.01 * Math.acos(Math.sin(x4) * Math.sin(x2) + Math.cos(x4) * Math.cos(x2) * Math.cos(y4 - y2));
      double s1 = (d1 + d4 + d5)/2;
      double s2 = (d2 + d3 + d5)/2;
      double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d5));
      double area2 = Math.sqrt(s2 * (s2 - d3) * (s2 - d4) * (s2 - d5));
      System.out.println("area:" + (area1 + area2) + "KM²");
   }
}
