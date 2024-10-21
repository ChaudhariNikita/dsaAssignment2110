package assignment2110;

import java.util.Scanner;

public class Citysearch {
	public static boolean linearSearch(String[] cities, String cityName) {
		for (String city : cities) {
			if (city.equalsIgnoreCase(cityName)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of cities: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] cities = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter city name " + (i + 1) + ": ");
			cities[i] = sc.nextLine();
		}

		System.out.print("Enter the city name to search: ");
		String cityName = sc.nextLine();

		if (linearSearch(cities, cityName)) {
			System.out.println(cityName + " is present in the list.");
		} else {
			System.out.println(cityName + " is not present in the list.");
		}
	}

}
