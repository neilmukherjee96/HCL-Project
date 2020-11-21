package restaurant;

public class RoomGuest {
	public static void main(String[] args) {
		RoomService rm=new RoomService(new IndianKitchen());// we create an instance of RoomService to choose menu	
		System.out.println(rm.takeOrder("dosa"));//we can use this classes function to call the specific dish we wanted.
	}

}
