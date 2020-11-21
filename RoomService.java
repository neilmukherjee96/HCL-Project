package restaurant;

public class RoomService {
	private Kitchen kitchen;

	public RoomService(Kitchen kitchen) {
		super();
		this.kitchen = kitchen;
	}
	public String takeOrder(String recipeName) {
		return kitchen.cookFood(recipeName);
	}

}
