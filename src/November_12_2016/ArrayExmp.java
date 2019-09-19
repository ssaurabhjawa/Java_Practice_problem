package November_12_2016;

public class ArrayExmp {
	public void addData() {
		int ar[];
		ar = new int[5];
		ar[0] = 500;
		ar[1] = 600;

		for (int i = 0; i < 2; i++) {
			System.out.print(ar[i]);
		}
	}

	public static void main(String[] args) {
		ArrayExmp ae = new ArrayExmp();
		ae.addData();
	}

}
