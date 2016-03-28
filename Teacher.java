public class Teacher extends Person
{
  String subject;
  
  public Teacher(String fName, String lName, String subject)
  {
    Person(fName, lName);
  }
  
  public String toString()
  {
    String temp = "";
    
    temp = temp + lastName + ", " + firstName + "\n   Subject:  " + subject;
    
    return temp;
  }
}