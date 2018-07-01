package JavaStepByStep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double[] f = {1,6,8,9,12,13,20,27,31,42,43,57,60,61,75,80,92,98};
	    boolean inputIsInt = true;
	    int number=0;
	    while(inputIsInt){
	        try {
                System.out.println("Input an integer:");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if(number>98 || number<1)
                    throw new OutOfRangeException();
                inputIsInt = false;
                System.out.println("Number is: "+number);

            }catch (InputMismatchException e){
                System.out.println("Input an integer pls");
            }catch (OutOfRangeException e1){
                System.out.println("your integer is out of range.");
            }
        }

        int index=0,start=0,end=f.length;
	    while(start<=end){
	        index =(start+end)/2;
	        if(number>f[index])
	            start=index+1;
	        else if(number<f[index])
                end=index-1;
	        else//
	            break;
        }
        if(number==f[index])
            System.out.println("The number you want is at: "+index);
	    else
            System.out.println("There is no number you want.");
    }
}
