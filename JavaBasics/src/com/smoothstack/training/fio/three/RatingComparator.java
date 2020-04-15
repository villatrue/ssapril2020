package com.smoothstack.training.fio.three;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() > o2.getRating()){
			return -1;
		}
		if(o1.getRating() < o2.getRating()){
			return 1;
		}
		return 0;
	}

	

}
