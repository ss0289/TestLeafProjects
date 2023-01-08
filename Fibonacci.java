package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0, secNum = 1, sum;
		for (int i = 1; i <= 11; ++i) 
		{
			System.out.println(firstNum);
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
	}

}
