package com.xworkz.swati.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class HospitalDto {
	 // Declare the number of variable
    // you want to capture the value
	@NotNull
	@Size(min = 3, max = 20, message = "name should be greater than 3 less than 20")
	private String name;
	@NotNull
	@Size(min = 3, max = 20, message = "location should be greater than 3 less than 20")
	private String location;
	@NotNull
	private Integer fees;
	@NotBlank(message = "specialist should not be blank")
	private String specialist;
	private Boolean clean;
	private int id;

}
