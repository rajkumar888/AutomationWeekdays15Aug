package com.comparabledemo;

public class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Constructor
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// default Constructor
	public Movie() {
	}

	public int compareTo(Movie m) {
		// return this.name.compareTo(m.name);
		// return this.year- m.year;

		if (this.rating == m.rating) {
			return 0;
		} else if (this.rating > m.rating) {
			return 1;
		} else {
			return -1;
		}
	}

	
	// generated getter methods
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie => [rating=>" + rating + ", name=>" + name + ", year=>" + year + "]";
	}

	

}