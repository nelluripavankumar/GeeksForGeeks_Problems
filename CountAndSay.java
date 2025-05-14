import java.util.Scanner;

public class CountAndSay {
    public static String count_and_say(int n){
        if(n == 1)
            return "1";
        String s = count_and_say(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            int counter = 1;
            i++;
            while(i < s.length() && s.charAt(i) == s.charAt(i-1)){
                i++;
                counter++;
            }
            i--;
            sb.append(counter);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // these problem i used recursion to get string
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input for the count_and_say encription algorithm : ");
        int n = s.nextInt();
        System.out.println(count_and_say(n));
    }
}
