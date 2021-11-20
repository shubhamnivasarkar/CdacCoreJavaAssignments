import java.util.Scanner;
public class Cal{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int i;
System.out.println("Enter size of array");
int size=scan.nextInt();
double[] arr=new double[size];
System.out.println("Enter elements of array");

for( i=0;i<arr.length;i++){
    arr[i]=scan.nextDouble();
    
}
System.out.println("Entered array is: "+ arr[i] );

System.out.println("Enter no of what you want to do: 1.Double content of array 2.Square is elements of array 3.Find squ root of elements");
int choise=scan.nextInt();
switch (choise){
    case 1:for(i=0;i<arr.length;i++){
            arr[i]=arr[i]*2;
            
        }System.out.println("Entered array is: "+ arr[i] );

            break;
    case 2:for( i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
            System.out.println("Entered array is: "+ arr[i] );
    }
            break;
    case 3:for( i=0;i<arr.length;i++){
            arr[i]=Math.sqrt(i);
            System.out.println("Entered array is: "+ arr[i] );
    }

            break;
}

scan.close();
}
}
