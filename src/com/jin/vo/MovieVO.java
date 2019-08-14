package com.jin.vo;

import java.util.Date;

public class MovieVO 
{
	private int movieNum;
	private String movieGenre;
	private String movieName;
	private String movieDirector;
	private String movieActor;
	private Date movieOpenDate;
	
	public MovieVO() {
		// TODO Auto-generated constructor stub
	}

	public int getMovieNum() {
		return movieNum;
	}

	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	public Date getMovieOpenDate() {
		return movieOpenDate;
	}

	public void setMovieOpenDate(Date movieOpenDate) {
		this.movieOpenDate = movieOpenDate;
	}

	
	public MovieVO(int movieNum, String movieGenre, String movieName, String movieDirector, String movieActor,
			Date movieOpenDate) {
		super();
		this.movieNum = movieNum;
		this.movieGenre = movieGenre;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieActor = movieActor;
		this.movieOpenDate = movieOpenDate;
	}

	@Override
	public String toString() {
		return "MovieVO [movieNum=" + movieNum + ", movieGenre=" + movieGenre + ", movieName=" + movieName
				+ ", movieDirector=" + movieDirector + ", movieActor=" + movieActor + ", movieOpenDate=" + movieOpenDate
				+ "]";
	}

	
}