Feature: add book
  
Background: users add book to the system
Given  the admin username is "ansam" and the password "1111" and the statuse "login"
 
Scenario: add with login 
  When the user status is "login"  add the books:
      | Title                           | Author                   |Signature     | isbn     |           
      | Marketing Management 3rd Edition| Mark Johnston            |    marketjon |0112112425|
      |The Palace of Illusions          |Chitra Banerjee Divakaruni| bluerus      |0966378601|    
      |Shepherd Press                   | Tedd Tripp               |  bluerus      |0198526636|     
      |Shepherd Press                   | Tedd Tripp               | bluerus      |0966378601|           
  Then add the books 
 Scenario: add without login 
 Given  the admin username "ansam" dosent login
 

  When the user status is "logout" and want to add the books:
  | Title                           | Author                   |Signature     | isbn     |           
      | Marketing Management 3rd Edition| Mark Johnston            |    marketjon |1259637158|
      |Shepherd Press                   | Tedd Tripp               | sherted      |0966378601|           
      |The Palace of Illusions          |Chitra Banerjee Divakaruni| bluerus      |0966378601|    
  
  
  Then dont add the books
    