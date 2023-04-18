package com.xworkz.fruit.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FruitDto {
	@NotNull
	private int id;
	@NotBlank(message="----")
	@Size(min = 3,max=20 ,message="Fruit name should less than 3 and grather than 20")
	private String name;
	@NotNull(message="color should be selected")
	private String color;
	@NotNull
	private int price;
	private boolean tasty;

}
