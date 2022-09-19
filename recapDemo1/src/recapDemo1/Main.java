package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 26;
		int number3 = 18;
		int greatesNumber = number1;
		
		if(greatesNumber<number2) {
			greatesNumber = number2;
		}
		if (greatesNumber<number3) {
			greatesNumber = number3;
		}
		System.out.println("greates number is : "+greatesNumber);
	}

}
