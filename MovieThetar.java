package wavelabsbasicprograms;

public class MovieTheater {
	static int TICKETS = 50;

	public void bookTickets(int n) {
		if (n <= TICKETS) {
			TICKETS = TICKETS - n;
			System.out.println(" Booking" + n + "Tickets successfully......!");
		} else {
			System.out.println(" invlaid input <please enter below number 50>");
		}
	}

	public void cancelTicket(int n) 
	{
		if(TICKETS<=50) {
		TICKETS = TICKETS + n;
		System.out.println(" No of" + n + " Tickets cancelled successfully");
		}
		else
		{
			System.out.println(" you dont have any Booked Tickets");
		}

	}

	public void avaiableTicket() {
		System.out.println(" only this"+"  "+TICKETS+" "+"Tickets Left");

	}
            
       System.out.println(" main method ended");   

}

