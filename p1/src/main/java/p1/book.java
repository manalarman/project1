
package p1;

public class book {
String Title,Author,Signature;
int isbn;
public book(String title, String author, String signature, int isbn) {
	super();
	Title = title;
	Author = author;
	Signature = signature;
	this.isbn = isbn;
}

public book() {
	// TODO Auto-generated constructor stub
}

public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getSignature() {
	return Signature;
}
public void setSignature(String signature) {
	Signature = signature;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}

}
