package Practice_Start_Week6;

public class BMI {

	private String name;
	private int age;
	private double height;
	private double weight;
	
	public BMI(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		System.out.println(name + " right now " + age + " age, and her wight is " +getStatus());
	}
	
	public String getStatus() {
		String status = null;
		double bmi = getBMI();
		if(bmi <= 15.0) {
			status = "very thin";
		}else if (bmi >15 && bmi <= 18.5) {
			status = " a little thin";
			
		}else {
			status = "FAT";
		}
		return status;
	}
	
	public double getBMI() {
		return weight/Math.pow(height, 2);
	}

}
