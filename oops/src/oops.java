//textual representation of an object
//whatever you will write in class,will be the property of object
class user{
	//Attributes
	//Property of object and not of class
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
}
public class oops {

	public static void main(String[] args) {
		int a = 10;//SVC
		int[] arr = {10,20,30,40};//MVC
		//Object Construction
		user uRef1 = new user();
		//arr and uRef are not objects they are reference variable
		user uRef2 = new user();
		user uRef3 = uRef1;//reference copy!!
		System.out.println("a is :"+a);
		System.out.println("arr is :"+arr);
		System.out.println("uRef1 is :"+uRef1);// printing the hashcode 
		System.out.println("uRef2 is :"+uRef2);
		System.out.println("uRef3 is :"+uRef3);
  //Writing data in object
		uRef1.name = "mark";
		uRef1.phone ="+9123456789";
		uRef1.address =" ABCD";
		uRef1.email = "mark@gmail.com";
		uRef1.gender = 'f';
		uRef1.age = 22;
		
		uRef2.name = "kitten";
		uRef2.phone ="+9154865322";
		uRef2.address =" EFGHIJ";
		uRef2.email = "Kitten@gmail.com";
		uRef2.gender = 'f';
		uRef2.age = 30;
  //update data in object
		uRef3.name ="mark swiss";
 // Read data from object
		System.out.println(uRef1.name+"is"+uRef1.age+"years old");
		System.out.println(uRef2.name+"is"+uRef2.age+"years old");
 //delete object 
 //This is taken care by Garbage Collector!!
 //System.gc();// Execute GC
		
		
}
}
