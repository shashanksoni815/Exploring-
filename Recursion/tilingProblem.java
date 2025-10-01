package Recursion;

public class tilingProblem {
    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        };

        // horizontal
        int hri = ways(n-1);

        // vertical
        int ver = ways(n-2);
        
        return (hri + ver);
    };

    public static void duplicate(String str, int idx, StringBuilder newStr, boolean map[] ) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            duplicate(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            duplicate(str, idx+1, newStr.append(currChar), map);
        }

    }

    public static int friendsParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // Single
        int solo = friendsParing(n - 1);
        // Combo
        int combo = friendsParing(n - 2);
        int pairs = (n-1) * combo;

        // both ways
        return (solo + pairs);
    }

    public static void consecutive(int n, int lastPlace, String str) {
        if (n == 0 ) {
            System.out.println(str);
            return;
        }

        // kaam

        consecutive(n-1, 0, str+"0");
        if (lastPlace == 0) {
            consecutive(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        // System.out.println(ways(5));
        // String str = "appnnacollezsrdefsdge";
        // duplicate(str, 0, new StringBuilder("") , new boolean[26]);

        // System.out.println(friendsParing(5));
        consecutive(4, 0, "");

    }
}
