package src;

public class App {
	
	public App() {
		Gun gun = new Gun(10);
		gun.load(2);
		
		do {
			gun.shoot();
		}while(gun.hasChambersLeft());
	}

	public static void main(String args[]) {
		App app = new App();
	}
	
}
