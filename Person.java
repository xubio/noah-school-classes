public class Person
{
  String firstName;
  String lastName;
  
  public abstract class Person(String fName, String lName)
  {
    
  }
  
  public String toString()
  {
    String temp = "";
    
    temp = lastName + ", " + firstName;
    
    return temp;
  }
}