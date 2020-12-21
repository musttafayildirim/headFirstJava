public class DogAffectTestDrive{
	public static void main(String[] args){
		DogAffect one = new DogAffect();
		one.size = 70;
		DogAffect two = new DogAffect();
		two.size = 10;
		DogAffect three = new DogAffect();
		three.size = 25;

		one.bark();
		two.bark();
		three.bark();
	}


}
