import java.util.Arrays;
import java.util.Scanner;

public class codearray {
	public static void main(String[] args) throws Exception {
	    Scanner s = new Scanner(System.in);
	    String[] array = new String[3];

	    System.out.println("Nhập các phần tử của mảng: ");

	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextLine();
	    }
	    System.out.println("Output: " + Arrays.toString(array).substring(1,3));

	}
}
