import java.util.Scanner;
public class PostageProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight = 0;
		while (weight != -1) {
			System.out.println("Enter a weight in ounces for letters to mail out.");
			System.out.print("When you are done entering, please ender -1 to finish: ");
			weight = input.nextDouble();
			if (weight <= 1) {
				System.out.println("You can use forever stamp.");
			} else if (weight > 1) {
				System.out.println("You need additional postage than a forever stamp.");
			}
		}
		System.out.print("Good bye!");
	}
}
