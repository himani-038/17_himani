package third_project;

class Number{
	private double n;
	public Number(double n) {
		this.n = n;
	}
	public boolean isZero() {
		if(n==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPositive() {
		if(n>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isNegative() {
		if(n<0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEven() {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOdd() {
		if(n%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPrime() {
		if(n<=1) {
			return false;
		}
			for(int i=2; i<n; i++)
				if(n%i==0)
					return false;
			return true;
	}
	public boolean isArmstrong() {
		if(n<=1) {
			return false;
		}
			for(int i=2; i<n; i++)
				if(n%i==0)
					return false;
			return true;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Number n = new Number(23);
		if(n.isZero()) {
			System.out.println("It is equal to zero.");
		} else {
			System.out.println("It is not equal to zero.");
		}
		if(n.isPositive()) {
			System.out.println("It is Positive.");
		} else {
			System.out.println("It is not Positive.");
		}
		if(n.isNegative()) {
			System.out.println("It is Negative.");
		} else {
			System.out.println("It is not Negative.");
		}
		if(n.isEven()) {
			System.out.println("It is Even.");
		} else {
			System.out.println("It is not Even.");
		}
		if(n.isOdd()) {
			System.out.println("It is Odd.");
		} else {
			System.out.println("It is not Odd.");
		}
		if(n.isPrime()) {
			System.out.println("It is Odd.");
		} else {
			System.out.println("It is not Odd.");
		}
		if(n.isArmstrong()) {
			System.out.println("It is Armstrong.");
		} else {
			System.out.println("It is not Armstrong.");
		}

	}

}
