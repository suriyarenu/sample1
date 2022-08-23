package Com.login;

public class clientinfo { 
	long c=100;
	private void saving() {  	
		
	}

	public static void main(String[] args) {
		clientinfo c = new clientinfo(); 
		
		System.out.println("before initialization:"+c); 
		
		c.saving();
		
		System.out.print("after initialization:"+c.c); 
		
		System.out.println("*********"); 
		
		clientinfo c1 = new clientinfo(); 
		
		System.out.print("before initialization:"+c1.c);
		
		c1.saving();
		
		
	}

}
 