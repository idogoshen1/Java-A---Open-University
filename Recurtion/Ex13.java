package Ex13;


/**
 * Write a description of class Ex13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   class Ex13 {
    
    public static int digitDiffer(int a, int b) {
        System.out.println("a=" + a + ", b=" + b);
        if (a==0 && b==0) {
            System.out.println(0);
            return 0;
        }
        if (a==0 && b>0) {
            int res = digitDiffer(a, b/10)+1;
            System.out.println(res);
            return res;
        }
        if (a>0 && b==0) {
            int res = digitDiffer(a/10, b)+1;
            System.out.println(res);
            return res;
        }
        if (a>0 && b>0) {
            int res = digitDiffer(a/10, b/10);
            System.out.println(res);
            return res;
        }
        return 0;
    }
    
    public static int howManyLetters(String s) {
        if(s.length() == 0) {
            return 0;
        }
        
        int count = howManyLetters(s.substring(0, s.length()-1));
        char ch = s.charAt(s.length()-1);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z')) {
            count+=1;
        }
        return count;
    }
    
    
    
    // return length of the longest string in s2 that conainded only letters from s1
    public static int maxSection(String s1, String s2) {
        return maxSection(0, 0, s1, s2); 
    }
        
    private static int maxSection(int max, int cnt, String s1, String s2) {
        if(s2.length() == 0) {
            return max;
        }
        if(s1.indexOf( s2.charAt(0) ) == -1 ) { //not in s1
            cnt = 0;
        } else { // in s1
            cnt++;
            if(max < cnt) {
                max = cnt;
            }
        }
        return maxSection(max, cnt, s1, s2.substring(1));
    }
}
        