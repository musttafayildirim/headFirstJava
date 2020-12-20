public class BookTestOOP{
	public static void main(String[] args){
		Book book1 = new Book();
		Book book2 = new Book();

		book2.setPage(12);
		book2.setName("Deneme kitap2");
		
		System.out.println("Book2'nin sayfa sayısı => " + book2.getPage());
		System.out.println("book2'nin başlığı => " + book2.getName());

		book1.setPage(35);
		book1.setName("Deneme kitap1");
		
		System.out.println("Book1 sayfa sayısı => " + book1.getPage() + "\nBook1'in başlığı => " + book1.getName());

		book1 = book2;

		System.out.println("Artık book1 book2'yi refere ediyor " + book1.getPage() + " " + book1.getName());
	
	
	}


}
