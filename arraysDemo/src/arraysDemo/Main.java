package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] array1 = new String[4];
		array1[0] = "Batuhan";
		array1[1] = "Mehmet";
		array1[2] = "Ahmet";
	    array1[3] = "Ömer";
	    
	    for(String student : array1) {
	    	System.out.println(student);
	    }
	}

}
