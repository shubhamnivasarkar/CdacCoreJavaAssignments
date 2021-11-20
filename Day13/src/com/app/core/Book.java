package com.app.core;
import com.app.core.Category;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Book {
	
	private String title;
	private Category type;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat ("dd/MM/yyyy");
	}
	
	public Book(String title, Category type, double price, Date publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.type = type;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Book)
			return this.title == ((Book)o).title;
		return false;
	
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(this.title);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Category getType() {
		return type;
	}


	public void setType(Category type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity+= quantity;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}


	public static void setSdf(SimpleDateFormat sdf) {
		Book.sdf = sdf;
	}
	
}

