package com.jin.vo;

import java.util.Date;

public class MovieVO 
{
	private int MovieNum;
	private String MovieGenre;
	private String MovieName;
	private String MovieDirector;
	private String MovieActor;
	private Date MovieOpenDate;
	
	public MovieVO() {
		// TODO Auto-generated constructor stub
	}

	public MovieVO(int movieNum, String movieGenre, String movieName, String movieDirector, String movieActor,
			Date movieOpenDate) {
		super();
		MovieNum = movieNum;
		MovieGenre = movieGenre;
		MovieName = movieName;
		MovieDirector = movieDirector;
		MovieActor = movieActor;
		MovieOpenDate = movieOpenDate;
	}

	public int getMovieNum() {
		return MovieNum;
	}

	public void setMovieNum(int movieNum) {
		MovieNum = movieNum;
	}

	public String getMovieGenre() {
		return MovieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		MovieGenre = movieGenre;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getMovieDirector() {
		return MovieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		MovieDirector = movieDirector;
	}

	public String getMovieActor() {
		return MovieActor;
	}

	public void setMovieActor(String movieActor) {
		MovieActor = movieActor;
	}

	public Date getMovieOpenDate() {
		return MovieOpenDate;
	}

	public void setMovieOpenDate(Date movieOpenDate) {
		MovieOpenDate = movieOpenDate;
	}
	
	
}
