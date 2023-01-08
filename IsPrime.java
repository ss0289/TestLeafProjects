package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n = 5;
		boolean Prime = true;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				Prime = false;
			}
			if (!Prime) {
				System.out.println(n +" is non Prime number.");
			} else {
				System.out.println(n+" is a prime number");
				break;
			}
		}
	}
}
