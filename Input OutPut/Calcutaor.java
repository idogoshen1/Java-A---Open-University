

 import java.util.Scanner ;
 
public class Calcutaor
  {
   public static void main (String[] args) 
   { 
       
       //double sum= num1/num2+num3/num4;
       Scanner scan = new Scanner ( System.in );
       System.out.println("please enter four integers");
       System.out.println("please enter the namorator of the frunction 1");
       int num1 = scan.nextInt();
       System.out.println("please enter the denominator of the frunction 1");
       int num2 = scan.nextInt();
       System.out.println("please enter the namorator of the frunction 2");
       int num3 = scan.nextInt();
       System.out.println("please enter the denominator of the frunction 2");
       int num4 = scan.nextInt();
       
       System.out.println(num1 + "/" + num2 + "+" + num3 + "/" + num4 + "=" + (num1*num4 +num2*num3) + "/" + (num2*num4) );
       System.out.println(num1+"/"+ num2 + "-" + num3 + "/" + num4+"=" + (num1*num4 -num2*num3) + "/" + (num2*num4) );
       System.out.println(num1+"/"+num2 +"*"+num3+"/"+ num4+"=" + (num1*num3) + "/" + (num2*num4) );
       System.out.println(num1+"/"+num2 +"/"+num3+"/"+ num4+"=" + (num1*num4 ) + "/" + (num2*num3));
       
    }
       


}     