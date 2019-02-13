import java.util.ArrayList;

public class Project4 implements Runnable{
	
	ArrayList<String> productsList = new ArrayList<>();
	
	public static void main(String[] args) {
		

		Project4 p = new Project4();
		p.productsList.add("Apple"); p.productsList.add("Banana"); p.productsList.add("Orange"); p.productsList.add("Mango");
		Thread thread = new Thread(p);
		thread.start();
		
	}

	@Override
	public void run() {
		
		double bill=0;
		for(String s: productsList) {
			if(s.equals("Apple"))	bill+=80;
			else if(s.equals("Banana"))	bill+=50;
			else if(s.equals("Orange"))	bill+=70;
			else if(s.equals("Mango"))	bill+=75;
		}
		System.out.println("Bill : "+bill );
	}
}
