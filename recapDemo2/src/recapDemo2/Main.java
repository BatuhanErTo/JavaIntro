package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.4,6.5,8.6};
		double sum = 0;
		double max = myList[0];
		for(double crazzy : myList) {
			sum += crazzy;
			if (max<crazzy) {
				max = crazzy;
			}
		}
		System.out.println("Sum : "+sum+" Max : "+max);
	}

}
