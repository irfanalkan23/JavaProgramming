package day19_RecapLoops;
import java.lang.*;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbbsccc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch == each) {
                    count++;
                }
            }

            if(result.contains(""+ch)) {
                continue;
            }
            result += ch;
            result += count;
        }


        System.out.println(result);
    }
}
