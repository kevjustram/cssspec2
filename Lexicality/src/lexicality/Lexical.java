/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicality;

/**
 *
 * @author ksramirez
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexical {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String line = in.nextLine();

        String wordpattern = "[a-z_0-9]*[a-z][0-9]*";
        Pattern word = Pattern.compile(wordpattern);
        Matcher wordmatcher = word.matcher(line);
        while (wordmatcher.find()) {
            System.out.println("TOKEN: " + wordmatcher.group(0));
            if (wordmatcher.group(0).matches("float|int|double")) {
                System.out.println("SYMBOLIC NAME: DATA TYPE");
            } else {
                System.out.println("SYMBOLIC NAME: IDENTIFIER");
            }
        }

        String digitpattern = "[0-9]*[0-9]";
        Pattern digit = Pattern.compile(digitpattern);
        Matcher digitmatcher = digit.matcher(line);
        while (digitmatcher.find()) {
            System.out.println("TOKEN: " + digitmatcher.group(0));
            System.out.println("SYMBOLIC NAME: NUM");
        }

        String pluspattern = "[+]";
        Pattern plus = Pattern.compile(pluspattern);
        Matcher plusmatcher = plus.matcher(line);
        while (plusmatcher.find()) {
            System.out.println("TOKEN: " + plusmatcher.group(0));
            System.out.println("SYMBOLIC NAME: PLUS");
        }

        String minuspattern = "[-]";
        Pattern minus = Pattern.compile(minuspattern);
        Matcher minusmatcher = minus.matcher(line);
        while (minusmatcher.find()) {
            System.out.println("TOKEN: " + minusmatcher.group(0));
            System.out.println("SYMBOLIC NAME: MINUS");
        }

        String timespattern = "[*]";
        Pattern times = Pattern.compile(timespattern);
        Matcher timesmatcher = times.matcher(line);
        while (timesmatcher.find()) {
            System.out.println("TOKEN: " + timesmatcher.group(0));
            System.out.println("SYMBOLIC NAME: TIMES");
        }

        String dividepattern = "[/]";
        Pattern divide = Pattern.compile(dividepattern);
        Matcher dividematcher = divide.matcher(line);
        while (dividematcher.find()) {
            System.out.println("TOKEN: " + dividematcher.group(0));
            System.out.println("SYMBOLIC NAME: DIVIDE");
        }

        String lparenpattern = "[(]";
        Pattern lparen = Pattern.compile(lparenpattern);
        Matcher lparenmatcher = lparen.matcher(line);
        while (lparenmatcher.find()) {
            System.out.println("TOKEN: " + lparenmatcher.group(0));
            System.out.println("SYMBOLIC NAME: LPAREN");
        }

        String rparenpattern = "[)]";
        Pattern rparen = Pattern.compile(rparenpattern);
        Matcher rparenmatcher = rparen.matcher(line);
        while (rparenmatcher.find()) {
            System.out.println("TOKEN: " + rparenmatcher.group(0));
            System.out.println("SYMBOLIC NAME: RPAREN");
        }

        String assignpattern = "[=]";
        Pattern assign = Pattern.compile(assignpattern);
        Matcher assignmatcher = assign.matcher(line);
        while (assignmatcher.find()) {
            System.out.println("TOKEN: " + assignmatcher.group(0));
            System.out.println("SYMBOLIC NAME: ASSIGN");
        }

        String semipattern = "[;]";
        Pattern semi = Pattern.compile(semipattern);
        Matcher semimatcher = semi.matcher(line);
        while (semimatcher.find()) {
            System.out.println("TOKEN: " + semimatcher.group(0));
            System.out.println("SYMBOLIC NAME: SEMI");
        }
    }

}
