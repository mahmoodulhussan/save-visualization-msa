package com.revature.app.dto;

import java.util.ArrayList;
import java.util.List;

//import com.revature.app.model.Skill;
import com.revature.app.model.Visualization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CurriculumDto {

	private String name;
	private List<Visualization> visList;
	
	public CurriculumDto(String name) {
		this.name = name;
		this.visList = new ArrayList<>();

	}
}
