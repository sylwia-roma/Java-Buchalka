package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

        String string = "I am a string. Yes I am.";
        //System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        //System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhhiiiiiijkl99z";
        System.out.println("1");
        System.out.println(alphanumeric.replaceAll(".","Y"));

        //it change only first variable
        // ^ starts boundry

        System.out.println("2");
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        System.out.println("3");
        String secindString = "abcDeeeF12abcDeeeGhhhiiiiiijkl99z";
        System.out.println("4");
        System.out.println(secindString.replaceAll("abcDeee", "YYY"));

        System.out.println("5");
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println("6");
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println("7");
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhhiiiiiijkl99z"));
        System.out.println("8");
        System.out.println(alphanumeric);

        // $ end boundry
        System.out.println(alphanumeric.replaceAll("jkl99z$", "THE END"));

        System.out.println("9");
        // [] each indvidual aei will be replace
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

        System.out.println("10");
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("11");
        System.out.println("Aarry".replaceAll("[Aa]arry", "Harry"));

        System.out.println("12");
        String newAlphanumeric = "abcDeeeF12Ghhhiiiiiijkl99z";
        System.out.println(newAlphanumeric);

        System.out.println("13");
        //replce all occurance not being ej
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));

        System.out.println("14");
        System.out.println(newAlphanumeric.replaceAll("[abcdef3456789]", "X"));

        System.out.println("15");
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println("16");
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));

        System.out.println("17");
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println("18");
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println("19");
        //  \\d     the same as 0-9
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));

        System.out.println("20");
        //  replace not digit with X
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        System.out.println("21");
        String hasWhitespace = "I have blanks and\ta tab, and also a newline \n";
        System.out.println(hasWhitespace);

        System.out.println("22");
        //remove all whitespaces
        System.out.println(hasWhitespace.replaceAll("\\s", ""));

        System.out.println("23");
        //replace tab whitespace
        System.out.println(hasWhitespace.replaceAll("\t", "X"));

        System.out.println("24");
        //replace only Tab, Spaces & Newline Characters remain
        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        System.out.println("25");
        //  \\w Matches the word characters.
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));

        System.out.println("26");
        //  \\W Matches the nonword characters.
        System.out.println(newAlphanumeric.replaceAll("\\W", "X"));

        System.out.println("27");
        // \\b Matches the word boundaries when outside the brackets.
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

        System.out.println("QUANTIFIERS AND THE PATTERN AND MATCHES CLASSES");


        String thirdAlphanumericString = "aaaabcDeeeF12Ghhhiiiiiijkl99z";
        System.out.println(thirdAlphanumericString);
        System.out.println(thirdAlphanumericString.replaceAll("^a{2}", "YYY"));

        //Operator "+" dopasowuje się do jednego lub więcej wystąpień podwyrażenia bezpośrednio przed nim. Oznacza to,
        //że zarówno "A*", jak i "A+" dopasuje się do "AAA" lub "A", ale tylko "A*" dopasuje się do pustego tekstu.

        System.out.println(thirdAlphanumericString.replaceAll("^a+", "YYY"));

        System.out.println(thirdAlphanumericString.replaceAll("^a*", "YYY"));


        //looking for between 1 and 3 "a" occurance
        System.out.println(thirdAlphanumericString.replaceAll("^a{1,3}", "YYY"));

        //looking for between 5 and 7 "a" occurance
        System.out.println(thirdAlphanumericString.replaceAll("^a{5,7}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is a paragraph about something else</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "(<h2>)";
        //Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        System.out.println("MATCHER FIND AND GROUP METHOD");

        matcher.reset();

        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurance " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPatter = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPatter);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurance: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPatetrn = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPatetrn.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurace: " + h2TextMatcher.group(2));
        }


        System.out.println("AND OR NOT EXPRESSION");

        //"abc" "a" and "b" and "c"

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
        //String tNotVRegExpr = "t[^v]";
        String tNotVRegExpr = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExpr);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
        System.out.println(tvTest);
        count = 0 ;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        //t(?=v)
        //Sample US phone number (800) 123-4567
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));


        //^4[0-9]{12}([0-9]{3})?$

        String visa1 = "4444444444444444";
        String visa2 = "54444444444444444";
        String visa3 = "4444444444444444444";
        String visa4 = "4444";

        System.out.println("visa1 = " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 = " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 = " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 = " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));


    }
}


