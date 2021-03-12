package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class control {
	public static String username;
	public static String password;
	public static String status;
	public static String s1, s22, s3;
	public static  int s4;
	public static ArrayList< user> items=new ArrayList< user>();
	public static ArrayList< book> item=new ArrayList< book>();
	Scanner sc=new Scanner(System.in);
	control(){
	
	}
	public String search(String s,String s2) {
		for(int i=0;i<items.size();i++) {
     		if((items.get(i).getUsername()).equals(s)) {
     			if((items.get(i).getPassword()).equals(s2)) {
     				password= s2;
     				
     			}
     			else 
     				password=null;
     		}
	 }
		return password;

    }
	public String validIsbn(int s) {
		
	
		return status;

    }
	public String search_status(String s) {
		for(int i=0;i<items.size();i++) {
     		if((items.get(i).getUsername()).equals(s)) {
     			
     				status=items.get(i).getStatus() ;
     				
     		}
     			else 
     				status=null;
     		}
	
		return status;

     }
	public void printBook(book b,int q) {
		System.out.println(q+"_"+"The Title:"+b.getTitle()+"_"+"The Author:"+b.getAuthor()+"_"+"The Signature:"+b.getSignature()+"_"+"The Isbn_10:"+b.getIsbn());
		
	}
	public String searchByTitle(String  title,int n) {
		int o=0;
		String Booktitle=title;
		for(int i=0;i<item.size();i++) {
     		if((item.get(i).getTitle()).contains(Booktitle)) {
     		o++;
     		 printBook(item.get(i),o);
     			
     		}
		}
		if(o==0) {return "not found";}
		else
			return "found";
		
	}
	public String searchByAuthor(String aut,int n) {
		int o=0;
		String BookAuthor=aut;
		for(int i=0;i<item.size();i++) {
     		if((item.get(i).getAuthor()).contains(BookAuthor)) {
     		o++;
     		 printBook(item.get(i),o);
     			
     		}
		}
		if(o==0) {return "not found";}
		else
			return "found";
	      }
	public String searchBysign(String sig,int n) {
		int o=0;
		String BookSignture=sig;
		for(int i=0;i<item.size();i++) {
     		if((item.get(i).getSignature()).contains(BookSignture)) {
     		o++;
     		 printBook(item.get(i),o);
     			
     		}
		}
		if(o==0) {return "not found";}
		else
			return "found";
	}
	public String searchByisbn(String isbn,int n) {
		int o=0;
		int  Bookisbn=Integer.parseInt(isbn);
		
		for(int i=0;i<item.size();i++) {
     		if(((item.get(i).getIsbn()))==(Bookisbn)) {
     		o++;
     		 printBook(item.get(i),o);
     			
     		}
		}
		if(o==0) {return "not found";}
		else
			return "found";
	}

	
	public boolean search_isbn(int isbn) {
		int n1=isbn;
		 boolean checker1 = true;
		for(int i=0;i<item.size();i++) {
     		if((item.get(i).getIsbn())==(n1)) {
     			
     			 checker1=false;
     		}
		}
		return checker1;

    }
	public boolean validisbn(int isbn) {

            int n=isbn;
	      

	       int sum = 0;
	        for (int i = 1; i <= 10; i++) {
	            int digit = n % 10;          
	            sum = sum + i * digit;
	            n = n / 10;
	        }
	        
	        boolean checker =(sum%11==0);
	        return checker;
		}
	
    public void addbook(String a1,String a2, String a3,String a4) {
	 int n = Integer.parseInt(a4);
	  if(validisbn(n)){
		if(search_isbn(n)) {
			book b =new book(a1,a2,a3,n);
			item.add(b);
			System.out.println("The Book Added Succssfully");
		}
		else 
			System.out.println("This Book is Exict");
	  }
	  else 
		System.out.println("invalid isbn number");
		

     }



		
}