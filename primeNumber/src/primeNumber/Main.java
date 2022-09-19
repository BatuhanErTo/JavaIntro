package primeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 11;
		boolean isPrime = true;
		if(number < 2) {
			System.out.println("not a prime number");
		}else {
			for(int i = 2; i < number;i++) {
				int remainder = number % i;
				if(remainder == 0) {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println("Prime number");
		}else {
			System.out.println("not a prime number");
		}
		
	}

}
