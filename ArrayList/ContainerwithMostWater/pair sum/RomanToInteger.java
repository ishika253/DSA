import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);

        int total = 0;
        int length = s.length();

        // Traverse the string
        for (int i = 0; i < length; i++) {
            int currentValue = romanMap.get(s.charAt(i));

            // Check if the current value is less than the next value
            if (i + 1 < length && currentValue < romanMap.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "XLII"; // Example input
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + result);
    }
}
