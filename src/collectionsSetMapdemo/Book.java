package collectionsSetMapdemo;

public class Book {
	
	int id, quantity;
	String name, author, publisher;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public Book() {
	}
	
	 public String toString()
	    {
	        return "[" + this.getId() + "=====>" + this.getName()+ " "+this.getAuthor()+" "+this.getPublisher()+" "+this.getQuantity()+"]";
	    }

}