public class temperture {
	
	private float value;
	private char scale;

	// default constructor
	temperture(){ // NO return type
		value = 0;
		scale = 'c';
	}

	// consturctor 2
	temperture (float v){
		this();
		value = v;
	}
	temperture (char s){
		this();
		scale = s;
	}
	temperture (float v, char s){
		value = v;
		scale = s;
	}

	// modifier method
	public void setValue(float v) {
		this.value = v; 
	}
	// accessor method
	public float getValue(){
		return value;
	}
	// modifier method
	public void setScale(char s){
		return scale;
	}
	// accessor method
	public char getScale(){
		return scale;
	}

	// (1) two methods to return the temperture:
	// one to return the degree in Celsius, the other to return the drgree in Fahrenheit
	// use the two following formulas to write the two methods
	//  drgreesC = S(drgreesF - 32) / 9
	//  degreesF = (9(degreesC/S) + 32)

	public float getTempF(){
		if (scale == 'C'){
			return 9*(value/5)+32;
		} else if (scale == 'F') {
			return value;
		} return 0;
	}

	public float getTempC(){
		if (scale == 'F'){
			return 5*(value-32)/9;
		} else if (scale == 'C') {
			return value;
		} return 0;
	}

	/*
	a comparison method with two parameters. both if the two objects of the temperature
	class (may be in different scales!) this method should return an integer;
		0: 		means the two temp are equal
		E.g., 0.0 degreesC = 32.0 degreesF; 0.0 degreesC = 0.0 drgreesC
		1:		means the first temp is higher than the second one
		-1:		means the first temp is lower that the second
	*/

	// instance method
	public int compareOne(temperture A){
		System.out.println(this.value);
		System.out.println(A.value);

	return 0;	
	}

		// class method
	public static int compare(temperture A, temperture B) {
		// the key word static means this is a class method not a instance 
		if (A.getScale() == 'C' && B.getScale() == 'C') {
			System.out.println("They are both C.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher then second");
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower then second");
			}
		}
		if (A.getScale() == 'F' && B.getScale() == 'F') {
			System.out.println("They are both F.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher then second");
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower then second");
			}
		}
		if (A.getScale() == 'C' && B.getScale() == 'F') {
			System.out.println("The first is C and second is F.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempC()) {
				System.out.println("1 - first temp is higher then second");
			}
			else if (A.getValue() < B.getTempC()) {
				System.out.println("-1 - first temp is lower then second");
			}
		}
		if (A.getScale() == 'F' && B.getScale() == 'C') {
			System.out.println("The first is F and second is C.");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempF()) {
				System.out.println("1 - first temp is higher then second");
			}
			else if (A.getValue() < B.getTempF()) {
				System.out.println("-1 - first temp is lower then second");
			}
		}
		return 0;
	}	

	// void Convertf(temperture t){}
}