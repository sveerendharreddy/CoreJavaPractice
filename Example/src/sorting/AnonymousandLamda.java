package sorting;

interface Testing{
	void display(String name);
}

public class AnonymousandLamda {
	

	public static void main(String[] args) {
		Testing obj = (String s)->System.out.println(s);
		
		Testing obj1 = new Testing() {

			@Override
			public void display(String name) {
				System.out.println(name);
				
			}
			
		};
		
		obj.display("hello");
	}
}
