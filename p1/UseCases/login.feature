Feature: login
  
Background: users in the system
Given  the admin user name is "ansam" and the password "1111"
   
Scenario: valid 
  When the user enter "ansam" as user name and "1111" as password
  Then login the system 
 Scenario: not valid 
  When the admin enter "ansam" as user name and "1112" as password
  Then you unable to login the system 
 

