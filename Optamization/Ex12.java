
/**
 * Write a description of class What here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex12
{

    public static void main(String []args){
        System.out.println("Hello World");
        int [] a = {7,9,1,3,5,6,7,9};
        System.out.println(what(a, 21));
        
        win(a);
    }

    public static boolean what (int [] a, int n) {
        int l = 0;
        int r = 0;
        int sum = a[l];
        while(r<a.length-1) {
            if(sum== n) {
                System.out.println("beetwin " + l + " and " + r);
                return true;
            }
            if(sum<n) {
                r++;
                sum+= a[r];
            } else {
                sum -=a[l];
                l++;
            }
        }
        System.out.println("No");
        return false;
    }

    public static void win(int [] a) {
        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<a.length; i++) {
            if(i%2==0) 
                evenSum+=a[i];
            else
                oddSum+=a[i];
        }
        int left=0;
        int right= a.length-1;
        while(left<right) {
            // my turn
            if(evenSum>=oddSum) { // I take even sum
                if (left%2==0) {
                    System.out.println("I take " + a[left]);
                    left++;
                } else {
                    System.out.println("I take " + a[right]);
                    right--;
                }
            } else { //I take odd index
                if (left%2!=0) {
                    System.out.println("I take " + a[left]);
                    left++;
                } else {
                    System.out.println("I take " + a[right]);
                    right--;
                }
            }
            //finish my turn
            //his turn - take the big number
            if (a[left] > a[right]) {
                System.out.println("he take " + a[left]);
                left++;
            } else {
                System.out.println("he take " + a[right]);
                right--;
            }
        }
    }
}
/*
א. השיטה בודקת אם קיימם תת מערך בחיבור מספריו מתבל עם המספר שנכנס בפרמטר
ב.סיבוכיות הזמן זהo(n^3) סיבוכיות מקום o(1) 
ד. סיבוכיות זמן הריצה היא O(n סיבוכיות המקום היא o(1)
 */
