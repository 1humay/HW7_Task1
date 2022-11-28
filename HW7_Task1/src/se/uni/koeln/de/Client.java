package se.uni.koeln.de;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	
	
	public static void main(String[] args) {
		
		List<HouseholdItem> householdItmes = new ArrayList<>();

		Electronic microwaveOven = new Electronic("Microwave Oven", 7, 8, 17, 14, false);
		Electronic tv = new Electronic("TV", 122, 70, 10, 18, true);

		Glass wineGlass = new Glass("Wine glasses", 40, 40, 33, 1);
		Glass coffeeTable = new Glass("Glass Coffee Table ", 50, 80, 45, 3);

		Furniture bed = new Furniture("Bed", "Metal", 200, 180, 64, 26);
		Furniture cupboard = new Furniture("Bookshelf", "Wood", 60, 30, 200, 25);

		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItmes.addAll(namesList);

		
	}


}
