public class Student extends Person
{
  public int studentId;
  public int level;
  int id = 0;
  
  public Student(String fName, String lName, int gLevel)
  {
    level = 0;
    
    if(gLevel < 0 && gLevel <= 12)
      level = gLevel;
    
    String fn = fName;
    String ln = lName;
    
    //(fName, lName);
    
    id++;
    
    studentId = id;
  }
  
  public int getLevel()
  {
    return level;
  }
  
  public String toString()
  {
    String temp = "";
    
    temp = temp + lastName + ", " + firstName + "\n   Grade Level: " + level + "\n   ID #: " + id;
    
    return temp;
  }
  
}