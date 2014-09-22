public class Driver {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No command line argument entered.")
		} else {
			String arg1 = args[0];
			String arg2 = args[1];
			System.out.println("this is " + arg1 + " and " + arg2);
		}
	float val = 12.0f;

	temperture one = new temperture();
	temperture two = new temperture(val);
	temperture three = new temperture('F');


	temperture four = new temperture(70, 'F');	

	// one.setValue(12);
	System.out.println("Temp in C is: " + four.getTempC());
	System.out.println("Temp in F is: " + four.getTempF());

	// the compare method is static with means it gets called from the class level not the object instances
	temperture.campare(one, two);
	temperture.campare(two, three);

	}
}