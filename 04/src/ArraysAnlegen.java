
public class ArraysAnlegen {

	public static void main(String[] args) {
		int[] array1 = new int[4];
		//int[] array1 = {1,2,3,4};

//		array1[0] = 1;
//		array1[1] = 2;
//		array1[2] = 3;
//		array1[3] = 4;
		
		for(int i=0; i<4; i++) {
			array1[i] = (i+1);
			System.out.println("index: " + i + " Wert: "+ array1[i]);
		}
		System.out.println("Laenge: " + array1.length);
		
		//System.out.println(array1);
		
		int[] eingabe = new int[8];
		for(int i=0; i<args.length;i++) {
			eingabe[i] = Integer.parseInt(args[i]);
			System.out.println(eingabe[i]);
		}
		
		
		

	}

}
