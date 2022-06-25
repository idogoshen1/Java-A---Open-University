
import java.util.Scanner; 

public class Train {

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        int s1 = scan.nextInt();
        int t1 = scan.nextInt();
        int s2 = scan.nextInt();
        int t2 = scan.nextInt();
        double distance =  s1 * (t1 / 60.0);
        double distance2 =  s2 * (t2 / 60.0);
        int abs = (int) Math.abs(distance - distance2);
        System.out.println("The distance between the two trains is" + abs + "km");
        
     }
}