package Feb21;

public class Person
{
	//new Constructor
	public Person(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
   // fields
   private String name;

private String email;
   private String phoneNumber;

   // constructor
   public Person(String theName)
   {
      this.name = theName;
   }

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
      Person p1 = new Person("desa");
      System.out.println(p1);
      Person p2 = new Person("Jone");
      p2.setEmail("jone@gmail.com");
      p2.setPhoneNumber("123-2334");
      System.out.println(p2);
      Person p3=new Person("Hyder", "1123hyder@gmail.com", "9182938849");
      System.out.println(p3);
   }
}
