import java.util.Random;

public class ex {

	public static void main(String args[]) {

		Random rnd = new Random();

		int[] num = new int[100];

		for (int i = 2; i < num.length; i++) {

			num[i] = rnd.nextInt(100) + 10;

			int index = 0;
			for (index = 0; index < num.length; index++) {
				if (num[i] % i == 0) {
					break;
				}

			}
			if (num[i] < index) {

				System.out.println(num[i]);
			}

		}

	}

}
