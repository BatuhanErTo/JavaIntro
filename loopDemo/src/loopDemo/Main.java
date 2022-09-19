package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i=1; i < 12;i+=2) {
			System.out.println(i);
		}
		System.out.println("döngü bitti");
		
		int number = 0;
		while (number<10) {
			System.out.println(number);
			number += 2;
		}
		
		int j = 199;
		do {
			System.out.println("loglandı");
			j++;
		} while (j<200);
	}

}
