

public class GumballMachine
{

	private int num_gumballs;	
	private int total_cost;
	private int machine_type;

	public GumballMachine( int type , int size)
	{
		// initialise instance variables
		this.num_gumballs = size;		
		this.machine_type = type;
		this.total_cost = 0;

	}


	public void insertCoin(int coin)
	{
		//checks for the machine type 1 and associate gumball cost i.e 25cents
		if(this.machine_type == 1)
		{
			if(coin == 25)
			{
				total_cost = 25;		
			}
			else
			{
				System.out.println("Please insert a quarter");
			}
		}
		//checks for the machine type 2 and associate gumball cost i.e 50cents
		else if (this.machine_type == 2)
		{
			if(coin == 25)
			{
				total_cost = total_cost + coin;
				if( total_cost != 50)
				{
					System.out.println("Please insert another coin");		    		
				}
			}
			else
			{
				System.out.println("Please insert a quarter");
			}	    		
		}//checks for the machine type 3 and associate gumball cost i.e 50cents
		else
		{
			total_cost = total_cost + coin;
			if(total_cost < 50)
			{
				System.out.println("Please insert another coin");
			}
		}
	}

	 // Compares the machine type candy cost and money entered
	public boolean IsReadytoEjectGumball()
	{

		if(machine_type == 1 &&  total_cost == 25)	
		{
			return true;
		}
		else if (machine_type == 2 &&  total_cost == 50)
		{
			return true;
		}
		else if (machine_type == 3 &&  total_cost >= 50)
		{
			return true;
		}
		else
			return false;
	}

	
	public void turnCrank()
	{
		if(IsReadytoEjectGumball())
		{

			if ( this.num_gumballs > 0 )
			{
				this.num_gumballs-- ;
				total_cost = 0 ;
				System.out.println( "Thanks.  Gumball Ejected!" ) ;
			}
			else
			{
				System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
			}
		}
		else 
		{
			System.out.println( "Please insert a coin" ) ;
		}        

	}

}


