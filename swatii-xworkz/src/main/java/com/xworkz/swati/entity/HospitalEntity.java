package com.xworkz.swati.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@Table(name = "hospital_table")
@NamedQuery(name="findByName",query = "Select entity from HospitalEntity entity where entity.name=:hospName")
@NamedQuery(name="findAll",query = "Select entity from HospitalEntity entity")
@NamedQuery(name="findByTwoProp",query = "Select entity From HospitalEntity entity where entity.name=:hospName OR entity.fees=:hospFees")
public class HospitalEntity {
	@Id
	@Column(name = "h_id")
	private int id;
	@Column(name = "h_name")
	private String name;
	@Column(name = "h_location")
	private String location;
	@Column(name = "h_fees")
	private int fees;
	@Column(name = "h_specialist")
	private String specialist;
	@Column(name = "h_clean")
	private Boolean clean;
}
