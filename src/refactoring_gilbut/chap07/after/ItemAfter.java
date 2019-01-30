package refactoring_gilbut.chap07.after;

public class ItemAfter {

	private ItemType itemType;
	private final String title;
	private final int price;

	public ItemAfter(ItemType itemType, String title, int price) {
		this.itemType = itemType;
		this.title = title;
		this.price = price;
	}

	public int getTypecode() {
		return itemType.getTypecode();
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("ItemAfter [typeCode=%s, title=%s, price=%s]", getTypecode(), title, price);
	}
	
	
}
