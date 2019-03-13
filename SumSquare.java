public class SubSquare  {
  public static void main(String[]args) {
		int num = 0;
		int sum = 0;

		while (num < 33) {

			num = num + 3;
			sum = sum + num * num;
			// System.out.printf("Cumulation result: " + sum + " : " + num + " * " + num);
			System.out.printf("Cumulation result: %8d%8s%8d%8s%8d \n", sum, ":", num, "*", num);
		}
		System.out.println("The SUM of the squares of multiples of 3 is: " + sum);

    //here-v
    //Jason 
  }
}
