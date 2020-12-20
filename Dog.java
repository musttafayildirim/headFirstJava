class Dog{

	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void bark(){
		System.out.println(name + "Hav hav hav!!!");
	}

	public void eat(){
		System.out.println(name + "Köpek yemek yedi.");
	}

	public void chaseCat(){
		System.out.println(name + "Kediyi yakaladı.");
	}
}
