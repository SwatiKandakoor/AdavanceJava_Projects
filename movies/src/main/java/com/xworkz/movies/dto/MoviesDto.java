package com.xworkz.movies.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="movies")
public class MoviesDto {
	@Column(name="m_id")
	@Id
	private int id;
	@Column(name="m_name")
	private String name;
	@Column(name="m_heroName")
	private String heroName;
	@Column(name="m_ticketPrice")
	private double ticketPrice;
	@Column(name="m_director")
	private String director;
	
	@Override
	public String toString() {
		return "MoviesDto [id=" + id + ", name=" + name + ", heroName=" + heroName + ", ticketPrice=" + ticketPrice
				+ ", director=" + director + "]";
	}

}
