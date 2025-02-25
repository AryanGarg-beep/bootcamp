import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	//taking input
    System.out.print("Enter the number: ");
    int number = input.nextInt();
	input.close();
	//checking for natural numbers 
	if(number>0){
		for(int i=6;i<=9;i++){
			//printing output
        System.out.println(number + " * " + i + " = " + number*i);
		}
	}
		else{
			System.out.println("The number is not a whole number");
		}
  }
}

