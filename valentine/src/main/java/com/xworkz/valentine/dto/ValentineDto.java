package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValentineDto {
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20")
	private String name;
	@Size(min = 3, max = 20, message = "valentineName cannot be less than 3 or greater than 20")
	private String valentineName;
	@NotBlank(message="place should be selected")
	private String place;
	@NotBlank(message="gift should be selected")
	private String gift;

}
