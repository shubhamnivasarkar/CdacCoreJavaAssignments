import java.util.Scanner;
public class Double{
public static void main(String[] args){
double a=0,b=0;
System.out.println("Enter 1st number");
Scanner scan=new Scanner(System.in);
if(scan.hasNextDouble()){
   a=scan.nextDouble();
    System.out.println("Enter 2st number");
        if(scan.hasNextDouble()){
              b=scan.nextDouble();
            }else {
                        System.out.println("Entered number is not double type ");
        }
}   else{
    System.out.println("Entered number is not double type ");
}



double avg=(a+b)/2;

System.out.println("Average of given numbers is: "+avg);

scan.close();
}
}