// RECURSION

// Remove duplicate from a string
import java.util.*;

class no67 {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // check if the current char is a duplicate or not
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a']) {
            // is a duplicate
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            // is a unique character
            map[currentChar - 'a'] = true; 
            removeDuplicate(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "kjjdgaeedddsad";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
