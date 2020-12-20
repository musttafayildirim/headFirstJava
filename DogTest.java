public class DogTest{
	
	public static void main(String[] args){
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.setName("Bart");	
		//now make a Dog Array
		Dog[] myDogs = new Dog[3];

		//and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].setName("Fred");
		myDogs[1].setName("Marge");

		System.out.println("myDog[2] name => " + myDogs[2].getName());

		// now loop through the array 
		// and tell all dogs to bark
		
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
}
