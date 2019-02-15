package point.of.sale;

import java.util.HashMap;

public class POS {
	private HashMap<String, MenuItems> menuTable = new HashMap<String, MenuItems>();
	
	
	



public MenuItems getPLUNumber(String pluNum) {
	return menuTable.get(pluNum);
	
}






public int getNumofMenuItems() {
	
	return menuTable.size();
}






public void addMenuItem(MenuItems newItem) {
	menuTable.put(newItem.pluNumber(), newItem);
	
}









}