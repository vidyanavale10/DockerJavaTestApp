package Dockermaven.Dockemaven;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkIfInputIsASEvenNumber(122));
		// Testing in the main method
		

	}

	public static boolean checkIfInputIsASEvenNumber(int number) {
		
		return number % 2 ==0;
	}

}
