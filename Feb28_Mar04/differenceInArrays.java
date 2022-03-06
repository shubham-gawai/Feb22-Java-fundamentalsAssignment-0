// WAP to difference in two array :
package arrayPractice;

public class differenceInArrays {

	public static void main(String[] args) {

		int a[] = { 45, 6, 86, 90, 34 };
		int b[] = { 21, 35, 76, 18, 74 };

		int c[] = new int[a.length];

		// int diff = c[0];
		for (int i = 0; i < a.length; i++) {
			// b[i] = a[i];
			// c[i] = a[i];

			c[i] = a[i] - b[i];
		}
		System.out.println("New array c[] :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(c[i] + " ");

		}
	}

}
