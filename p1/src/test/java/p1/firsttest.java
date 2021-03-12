package p1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firsttest {
public static	String t_username,t1_password,t3_username;
public static	String t2_username,t2_password,t3_password,t4_password,ss1,ss2,ss3,ss4,ss5;
public static String title,author,signature,found,strings;
String isbn;

public static ArrayList< book> item1=new ArrayList< book>();

	user u,u2;
	control c=new control();
book b =new book();
		@Given("the admin user name is {string} and the password {string}")
		public void theAdminUserNameIsAndThePassword(String string, String t_password) {
		u=new user(string,t_password);
		t1_password=t_password;
		 c. items.add(u);
		
		}


		@When("the user enter {string} as user name and {string} as password")
		public void theUserEnterAsUserNameAndAsPassword(String string, String string1) {
		    // Write code here that turns the phrase above into concrete actions
			
			t2_password=c.search(string,string1)	;
		}
		@Then("login the system")
		public void loginTheSystem() {
		    // Write code here that turns the phrase above into concrete actions
		
		assertEquals(t2_password,t1_password);
		u.setStatus("login");
		
		}
		@When("the admin enter {string} as user name and {string} as password")
		public void theAdminEnterAsUserNameAndAsPassword(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
			 t3_password = c.search(string,string2)	;
			 t4_password=string2;
			 
		}

		@Then("you unable to login the system")
		public void youUnableToLoginTheSystem() {
		    // Write code here that turns the phrase above into concrete actions
			assertNotEquals(t3_password,t4_password);
		
			System.out.println("Wrong Password");
		}

			@Given("the admin want to logout with username is {string}")
			public void theAdminWantToLogoutWithUsernameIs(String string) {
			    // Write code here that turns the phrase above into concrete actions
				t2_username=string;
			}


			@When("the user status {string}")
			public void theUserStatus(String string) {
			    // Write code here that turns the phrase above into concrete actions
				ss1=string;
				ss2=c.search_status(t2_username);
			}
			@Then("logout the system")
			public void logoutTheSystem() {
			    // Write code here that turns the phrase above into concrete actions
				assertEquals(ss1,ss2);
			}


			
	
				
   
 
          @Given("the admin username is {string} and the password {string} and the statuse {string}")
           public void theAdminUsernameIsAndThePasswordAndTheStatuse(String string, String string2, String string3) {
         // Write code here that turns the phrase above into concrete actions
	        t2_username=string;
	    u2=new user(string,string2);
	
	      c. items.add(u2);
	 u.setStatus(string3);
         }



				@When("the user status is {string}  add the books:")
				public void theUserStatusIsAddTheBooks(String string,List <List>A) {
					ss1=string;
					ss2=c.search_status(t2_username);
					if(	ss1.equals(ss2)) {
		                for(int i=1;i<(A.size());i++) {
							
							title=(String) A.get(i).get(0);
							author=(String) A.get(i).get(1);
							signature=(String) A.get(i).get(2);
							isbn=(String) A.get(i).get(3);
							c.addbook(title,author,signature,isbn);
							
							
		                }}

					
					
				 }
				@Then("add the books")
				public void addTheBooks() {
					assertEquals(ss1,ss2);
      }
				
				@Given("the admin username {string} dosent login")
				public void the_admin_username_dosent_login(String string) {
					  u.setStatus("logout");
					  t2_username=string;
				}
					@When("the user status is {string} and want to add the books:")
					public void theUserStatusIsAndWantToAddTheBooks(String string,List <List>B) {
						ss1=string;
						ss2=c.search_status(t2_username);
						
					}

					
					@Then("dont add the books")
					public void dontAddTheBooks() {
						assertEquals(ss1,ss2);
						System.out.println("you should login to be able add a book ");
						}

						@Given("these books are contained in the library")
						public void theseBooksAreContainedInTheLibrary() {
							System.out.println("---------------------------------------------");
							System.out.println("The Search Result :");
						}

			

						@When("the user  search about the book by the title as  {string}")
						public void the_user_search_about_the_book_by_the_title_as(String string) {
						    // Write code here that turns the phrase above into concrete actions
							String tit=string;
							int z=1;
							System.out.println(string+" is");
							found=c.searchByTitle(tit,z);
						}

						

						@Then("A book that matches book title  should be returned and printed on the console")
						public void aBookThatMatchesBookTitleShouldBeReturnedAndPrintedOnTheConsole() {
							// Write code here that turns the phrase above into concrete actions
							assertEquals(found,"found");
					}
						
							@When("the user  search about the book by the Author name as  {string}")
							public void theUserSearchAboutTheBookByTheAuthorNameAs(String string) {
							    // Write code here that turns the phrase above into concrete actions
								int z=1;
								String Aut=string;
								System.out.println(string+" is");
								found=c.searchByAuthor(Aut,z);
							
							}

							

							@Then("A book that matches book Author  should be returned and printed on the console")
							public void aBookThatMatchesBookAuthorShouldBeReturnedAndPrintedOnTheConsole() {
							    // Write code here that turns the phrase above into concrete actions
								assertEquals(found,"found");
							}

							
								@When("the user  search about the book by the Signature as  {string}")
								public void theUserSearchAboutTheBookByTheSignatureAs(String string) {
								    // Write code here that turns the phrase above into concrete actions
									String sig=string;
									int z=1;
									System.out.println(string+" is");
									found=c.searchByisbn(sig,z);
								
								}

								
								@Then("A book that matches book Signature  should be returned and printed on the console")
								public void aBookThatMatchesBookSignatureShouldBeReturnedAndPrintedOnTheConsole() {
								    // Write code here that turns the phrase above into concrete actions
									assertEquals(found,"found");
									
								}




						
								@When("the user {string} and the statuse {string} and search about the book by the  {string} with a string or substring {string}")
								public void the_user_and_the_statuse_and_search_about_the_book_by_the_with_a_string_or_substring(String string, String string2, String string3, String string4) {
								    // Write code here that turns the phrase above into concrete actions
								    
									t3_username=string;
									ss3=string2;
									ss4=c.search_status(t3_username);
								
									int z=1;
								if(string3.equals("Title")) {
									
									String tit=string4;
									System.out.println(string4+" is");
									found=c.searchByTitle(tit,z);	
								}
								else if(string3.equals("Author")) {
									String Aut=string4;
									
									System.out.println(string4+" is");
									found=c.searchByAuthor(Aut,z);
								
								}
								else if(string3.equals("Signature")) {
									String sign=string4;
									
									System.out.println(string4+" is");
									found=c.searchBysign(sign,z);
								
								}
								else if(string3.equals("isbn")) {
									String isbn=string4;
									
									System.out.println(string4+" is");
									found=c.searchByisbn(isbn,z);
								
								}
								ss5=ss4+"_"+found;
								}
								
								

									@Then("A  book that matches information should be returned and printed on the console")
									public void aBookThatMatchesInformationShouldBeReturnedAndPrintedOnTheConsole() {
									    // Write code here that turns the phrase above into concrete actions
										assertEquals(ss5,"login_found");

									}

									@When("the user  search about the book by the  {string} with string or substring {string}")
									public void theUserSearchAboutTheBookByTheWithStringOrSubstring(String string, String string2) {
									    // Write code here that turns the phrase above into concrete actions
									   
int z=0;
										
										if(string.equals("Title")) {
									
											String tit=string2;
											System.out.println(string2+" is");
											found=c.searchByTitle(tit,z);	
										}
										else if(string.equals("Author")) {
											String Aut=string2;
											System.out.println(string2+" is");
											found=c.searchByAuthor(Aut,z);
										
										}
										else if(string.equals("Signature")) {
											String sign=string2;
											System.out.println(string2+" is");
											found=c.searchBysign(sign,z);
										
										}
										else if(string.equals("isbn")) {
											String isbn=string2;
											System.out.println(string2+" is");
											found=c.searchByisbn(isbn,z);
										
										}
									}
									@Then("he dosent found any data")
									public void he_dosent_found_any_data() {
									    
										assertEquals(found,"not found");
										
									}
								
									@When("the user  search about the book by the  {string} with a string or substring {string}")
									public void theUserSearchAboutTheBookByTheWithAStringOrSubstring(String string, String string2) {
									    // Write code here that turns the phrase above into concrete actions
										int z=0;
										
										if(string.equals("Title")) {
									
											String tit=string2;
											System.out.println(string2+" is");
											found=c.searchByTitle(tit,z);	
										}
										else if(string.equals("Author")) {
											String Aut=string2;
											System.out.println(string2+" is");
											found=c.searchByAuthor(Aut,z);
										
										}
										else if(string.equals("Signature")) {
											String sign=string2;
											System.out.println(string2+" is");
											found=c.searchBysign(sign,z);
										
										}
										else if(string.equals("isbn")) {
											String isbn=string2;
											System.out.println(string2+" is");
											found=c.searchByisbn(isbn,z);
										
										}
									   }

							

								
								
								@Then("Alist of books that matches the information should be returned and printed on the console")
								public void alistOfBooksThatMatchesTheInformationShouldBeReturnedAndPrintedOnTheConsole() {
								    // Write code here that turns the phrase above into concrete actions
									assertEquals(found,"found");
								}







}












