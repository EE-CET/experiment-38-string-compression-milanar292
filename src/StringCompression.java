import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringBuilder compressed = new StringBuilder();
        
        int count = 1;
        
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        // Check length condition
        if (compressed.length() < str.length()) {
            System.out.println(compressed.toString());
        } else {
            System.out.println(str);
        }
    }
}
