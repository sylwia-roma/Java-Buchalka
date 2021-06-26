package RegularExpressionsChallenge1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsChallenge {
    public static void main(String[] args) {

        //Challenge #1
        //Write the string literal regular expression that will match the following String.
        //Use the String.matches() method to verify your answer
        String challenge1 = "I want a bike.";

        System.out.println(challenge1.matches("^[A-Z]{1}[ ][a-z]{4}[ ][a-z]{1}[ ][a-z]{4}[\\.]$"));

        //Challenge #2
        //Now write a regular expression that will match "I want a bike" and "I want a ball".
        //Verify answer using the matches() methods.

        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches("^[A-Z]{1}[ ][a-z]{4}[ ][a-z]{1}[ ][a-z]{4}[\\.]$"));

        String regExp1 = "I want a \\w+.";
        String regExp2 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        //Challenge #3
        //In the last challenge,  we used the same regular expression twice. Use the Matcher.matches()
        //method to check for matches, instead of String.matches(), for the regular expression that uses \w+. Hint:
        //You'll have to compile a pettern.

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        //Challenge #4
        //Replace all occurrences of blank with an underscore for the following string.
        //Print out the resulting string.

        String challenge4 = "Replace all blanks with underscore.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        System.out.println(challenge4.replaceAll(" ", "_"));

        //Challenge #5
        //Write a regular expression that will match the following string in its entirety.
        //Use the String.matches() method to verify your answer.

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        //Challenge #6
        //Write a regular expression that will only match the challenge 5 string in its entirely.

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));


        //Challenge #7
        //Write a regular espression that will match a string that starts with a series of letters.
        //The letters must be followed by a period. After the period, there must be a series of digits.
        //The string "kjisl.22" would match. The string "f5.12a" would not.
        // Use this string to test your regular expression

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("[A-Z][a-z]+\\.\\d+$"));

        //Challenge #8
        //Modify regular expression in challenge 7 to use a group, so that we can print all the digits
        //that occur in a string that contains multiple occurances of the pattern. Write all the code
        //required to accomplish this(create a pattern and matcher, etc). Use the following string to test your code:

        String challenge8 = "abcd.135uvqz.7tzik.999";

        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while(matcher8.find()) {
            System.out.println("Occurance: " + matcher8.group(1));
        }

        //Challenge #9
        //Lets supose we're reading strings that match the patterns we used in challnge 7 and 8 from the file.
        //Tabs are used to seperate the matches, with one exception. The last match is followed by a newline.
        //Our revised 8 string would look like this:

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)(\\t|\\n)");
        Matcher matcher9 = pattern9.matcher(challenge9);

        while(matcher9.find()) {
            System.out.println("Occurance: " + matcher9.group(1));
        }

        //Challenge #10
        //Instead of printing out the numbers themselves, print out their start and end indicates.
        //Use the same string we used for challenge 9. Make those indicates inclusive. For example,
        //the start index printed for 135 should be 5, and the end index should be 7
        //Hint: you will need to look at the documentation for the Matcher.start() method .There's more than one version of these methods

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("(\\d+)");
        Matcher matcher10 = pattern10.matcher(challenge10);

        while(matcher10.find()) {
            System.out.println("Occurance: " + matcher10.start(1) + " to " + (matcher10.end(1)-1));
        }

        //Challenge #11
        //Suppose we have the following string containing points on a graph within curly braces.
        //Extract what's in the curly braces

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);

        while(matcher11.find()){
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        //Challenge #12
        //Write a regular expression that will match a 5-digits US zip code. Use "11111" as your test string

        String challnege12 = "11111";
        System.out.println(challnege12.matches("^\\d{5}$"));

        //Challenge #13
        //US zip codes can be followed by a dash and another four numbers. Write a regular expression that will match
        //those zip codes. Use "11111-1111" as your test

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        //Challenge #14
        //Write a regular expression that will match 5-digits US zip codes, and zip codes that contains
        //the optional 4 digits preceded by a dash

        System.out.println(challnege12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));

    }
}
