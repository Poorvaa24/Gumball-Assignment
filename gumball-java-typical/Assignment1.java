
public class Assignment1 {

	public static void main(String[] args) {

		System.out.println("Gumball Machine Version 1");
		GumballMachine g1 = new GumballMachine(1,5);
		g1.insertCoin(25);
		g1.turnCrank();

		System.out.println("Gumball Machine Version 2");
		GumballMachine g2 = new GumballMachine(2,5);
		g2.insertCoin(25);
		g2.insertCoin(25);
		g2.turnCrank();

		System.out.println("Gumball Machine Version 3");
		GumballMachine g3 = new GumballMachine(3,5);
		g3.insertCoin(10);
		g3.insertCoin(20);
		g3.insertCoin(20);
		g3.turnCrank();




	}

}
