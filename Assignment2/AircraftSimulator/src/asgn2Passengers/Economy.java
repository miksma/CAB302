/**
 * 
 */
package asgn2Passengers;

/**
 * @author hogan
 *
 */
public class Economy extends Passenger {

	/**
	 * Economy Constructor (Partially Supplied)
	 * Passenger is created in New state, later given a Confirmed Economy Class reservation, 
	 * Queued, or Refused booking if waiting list is full. 
	 * 
	 * @param bookingTime <code>int</code> day of the original booking. 
	 * @param departureTime <code>int</code> day of the intended flight.  
	 * @throws PassengerException if invalid bookingTime or departureTime 
	 * @see asgnPassengers.Passenger#Passenger(int,int)
	 */
	public Economy(int bookingTime,int departureTime) throws PassengerException {
		super(bookingTime, departureTime);
		this.passID = "Y:" + this.passID;

	}
	
	@Override
	public String noSeatsMsg() {
		return "No seats available in Economy";
	}
	
	/**
	 * upgrade passenger by copying the current properties and returning them as a passenger of the class above.
	 * In this case it returns a passenger of the type premium.
	 */
	@Override
	public Passenger upgrade() {
		Passenger newPass = new Premium();
		newPass.copyPassengerState(this);
		newPass.passID = "P:" + this.passID;
		return newPass;
	}
}