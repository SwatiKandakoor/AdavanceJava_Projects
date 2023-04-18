package com.xworkz.fruit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "fruit_table")
@NamedQuery(name="findByName",query = "Select entity from FruitEntity entity where entity.name=:byName")
public class FruitEntity {
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_color")
	private String color;
	@Column(name = "f_price")
	private int price;
	@Column(name = "f_tasty")
	private boolean tasty;

}
