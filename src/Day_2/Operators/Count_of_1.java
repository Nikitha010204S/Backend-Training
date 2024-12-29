

package Day_2.Operators;

import java.util.Scanner;

public class Count_of_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str=Integer.toBinaryString(n);
        System.out.println("Binary Representation :" +str);
        int count=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='1')
            {
                count++;
            }
        }
        System.out.println("Count of 1 : " + count);
    }
}
