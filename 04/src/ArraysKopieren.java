import java.util.Arrays;

public class ArraysKopieren {

	public static void main(String[] args) {
		// Aufgabe 1
		int[] array = {1,2,4,8,16};
		
		// Aufgabe 2
		int[] copy = array;
		
		// Aufgabe 3
		for(int i=0; i<copy.length; i++) {
			copy[i] = copy[i] * 2;
		}
		
		// Aufgabe 4
		for(int i=0; i<copy.length;i++) {
			System.out.println("index: " + i + ": " + array[i] + "," + copy[i]);
		}
		
		//Aufgabe 5
		int[] copy2 = new int[array.length];
		// Variante 1
		for(int i=0; i<array.length;i++) {
			copy2[i] = array[i];  
		}
		
		// Variante 2
		copy2 = new int[array.length];
		copy2 = array.clone();
		
		// Variante 3
		copy2 = new int[array.length];
		copy2 = Arrays.copyOf(array, 4);
		
		//Variante 4
		copy2 = new int[array.length];
		System.arraycopy(array, 0, copy2, 0, 4);
		
		

	}

}
