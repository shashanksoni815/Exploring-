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

    public static void main(String[] args) {
        // System.out.println(ways(5));
        String str = "appnnacollezsrdefsdge";
        duplicate(str, 0, new StringBuilder("") , new boolean[26]);
    }
}
