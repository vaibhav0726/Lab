package Lab04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab05_01 {

    public static void main(String[] args) {
        String target = "09876543218abc gla919876543218";
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        // Pattern p1 =Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        // Pattern p1 =Pattern.compile("//d");
        // Pattern p1 =Pattern.compile("//D");
        // Pattern p1 =Pattern.compile("//s");
        // Pattern p1 =Pattern.compile("//S");
        // Pattern p1 =Pattern.compile("//w");
        // Pattern p1 =Pattern.compile("//W");
        int ctr = 0;
        Matcher m = p.matcher(target);
        while(m.find()){
            ctr++;
            // System.out.println(m.group());
            System.out.println(m.start()+"   "+m.end()+"  "+m.group());
        }
        System.out.println(ctr);
        String s1 = "9876564321";
        System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
    }
}