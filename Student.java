package java8feature;
interface MyInterface{
	//A method ---abstract method
	public void display();
}
//---->Reference to abstract method and instance method


public class Student {
	/*Method references is the shot hand notation of lambda expression to call a method
	 * str-->System.out.println(str);
	 * System.out::println	 */
	public void myMethod()
	{
		System.out.println("Instance metrhod");
		System.out.println("---------I have been reference by abstract----");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		MyInterface ref=obj::myMethod;
		ref.display();

	}

}
