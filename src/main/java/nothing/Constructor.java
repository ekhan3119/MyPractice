package nothing;

public class Constructor {
	int x;
	
	//Create a constructor method
	public  Constructor(int y){
	int x=y;
	}
	
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(5);
		System.out.println(obj.x);
	}

}
