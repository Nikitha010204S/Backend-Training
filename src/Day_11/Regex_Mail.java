//Task: Write a Java program to validate a list of email addresses using regular expressions.
// The program should:
//Accept a list of email addresses as input.
//Validate each email address against the following rules:
//It must start with a letter or a number.
//It can include letters, numbers, dots (.), hyphens (-), and underscores (_).
//The domain name should be valid, ending with .com, .org, or .net.
//Print whether each email address is valid or invalid.
//
//Example Input
//Input: ["user@example.com", "user.name@domain.org", "invalid-email@domain", "user@domain_net", "@missinguser.com"]
//Expected Output
//user@example.com: Valid
//user.name@domain.org: Valid
//invalid-email@domain: Invalid
//user@domain_net: Invalid
//@missinguser.com: Invalid
package Day_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Mail {
    public static void main(String[] args) {
        String[] name= {"user@example.com","user.name@domain.org","invalid-email@domain","user@domain_net","@missinguser.com"};
       String exp="^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
       Pattern pattern = Pattern.compile(exp);
       for(String s:name){
           {
               Matcher matcher = pattern.matcher(s);
               if(matcher.matches())
                   System.out.println(s+": "+"Valid");
               else
                   System.out.println(s+": "+"Invalid");
           }
       }
    }
}
