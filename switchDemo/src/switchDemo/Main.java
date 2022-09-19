package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Orta : Geçtiniz");
				break;
			case 'E':
				System.out.println("Kötü : Kaldınız");
				break;
			case 'F':
				System.out.println("Geçersiz Not");
				break;
				
		}
	}

}
