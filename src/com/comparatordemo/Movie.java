package com.comparatordemo;

public class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	// public int compareTo(Movie m) {
	// return this.year - m.year;
	// }

	public int compareTo(Movie m) {
		if (this.rating == m.rating)
			return 0;
		else if (this.rating > m.rating)
			return 1;
		else
			return -1;
	}

	// public int compareTo(Movie m) {
	// return this.name.compareTo(m.name);
	// }

	// Constructor
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}