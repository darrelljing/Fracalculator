
public class hello {
    
    private int versionNumber;
	private String author;
	private String date;
	
    public int numerator;
    public int denominator;
    public float num;
    
	hello(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public void FracMembrt(int numerator,int denominator) {
		this.num = numerator/denominator;
		System.out.print(num);
	}
	static void BasicArithmetic(int numerator,int denominator) {
			int add = numerator + denominator;
			int divide = numerator/denominator;
			int multiply = numerator*denominator;
			int sub = numerator-denominator;
			System.out.print(add);
			System.out.print(divide);
			System.out.print(multiply);
			System.out.print(sub);
	}
	public float getFracMembrt(){
	    return num;
	}
}
