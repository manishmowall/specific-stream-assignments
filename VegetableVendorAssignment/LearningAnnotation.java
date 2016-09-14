@Ignore
class A{

	public void funct(){
		System.out.println("funct() of A class");			
	}
}




class LearningAnnotation{
	public static void main(String[] args) {
	A a = new A();
	a.funct();		
	}
}
