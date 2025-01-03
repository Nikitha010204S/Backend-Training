//Use Math class methods like sqrt() and pow() in a program to calculate the hypotenuse
// of a right-angled triangle using static imports.
package Day_5.Static_import;
import static java.lang.Math.pow;
public class Static_import {
    public static void main(String[] args) {
  double a=7.9;
  double b=8.9;
  double hypo=Math.sqrt(pow(a,2)+pow(b,2));
  System.out.println("Hypotenuse is :" +hypo);
    }

}
