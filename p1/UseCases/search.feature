Feature: search about  book
  
Background: The System has some book with their information 
Given  these books are contained in the library
     
Scenario Outline: Search the book by title of book
  When the user  search about the book by the title as  <Title>
  Then A book that matches book title  should be returned and printed on the console
 Examples:      
                |Title|
                |"Shepherd"|
                |"Shepherd Press"|
 Scenario Outline: Search the book by Author name of book
  When the user  search about the book by the Author name as  <Author>
  Then A book that matches book Author  should be returned and printed on the console
 Examples:      
                |Author|
                |"Tedd Tripp"|
                |"Tedd"|
 Scenario Outline: Search the book by Signature name of book
  When the user  search about the book by the Signature as  <isbn>
  Then A book that matches book Signature  should be returned and printed on the console
 Examples:      
                |isbn|
                |"0966378601"|
                 |"0198526636"|

   Scenario Outline: Search the book with login
  When the user "ansam" and the statuse "login" and search about the book by the  <type> with a string or substring <Word>
  Then A  book that matches information should be returned and printed on the console
 Examples:      
  |type       |Word|
  |"Title"    |"Pal"           | 
  |"Title"    |"Shepherd Press"| 
  |"Signature"|"blu"           |
  |"Signature"|"bluerus"       |
  |"isbn"     |"0966378601"    |
  |"Author"   |"Chitra Banerjee Divakaruni"     |
  |"Author"   |"rip"           |
  Scenario Outline: Search the book with uncorect data
  When the user  search about the book by the  <Type> with a string or substring <word>
  Then he dosent found any data
 Examples:      
    
  |Type       |word|
  |"Title"    |"b"    | 
  |"Signature"|"shapres"    |
  |"isbn"     |"123"    |
  |"Author"   |"ahmad"    |
Scenario Outline: Search about more than one book with same information
  When the user  search about the book by the  <Typ> with a string or substring <wor>
  Then Alist of books that matches the information should be returned and printed on the console
 Examples:      
   |Typ       |wor|
  |"Title"    |"Pal"           | 
  |"Title"    |"Shepherd Press"| 
  |"Signature"|"blu"           |
  |"Signature"|"bluerus"       |
  |"isbn"     |"0966378601"    |
  |"Author"   |"Chitra Banerjee Divakaruni"     |
  |"Author"   |"rip"           |