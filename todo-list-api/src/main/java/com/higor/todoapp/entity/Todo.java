package com.higor.todoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.higor.todoapp.consts.TodoAppConsts;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = TodoAppConsts.TODOAPP_SCHEMA)
public class Todo {

	@Id
	@GeneratedValue(generator = "idTodo", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "idTodo", schema = TodoAppConsts.TODOAPP_SCHEMA, sequenceName = "pk_todo", initialValue = 1, allocationSize = 10)
	@Getter @Setter
	private Integer id;
	
	@Column(length = 255, nullable = false)
	@Getter @Setter
	private String text; 
	
	@Column
	@Getter @Setter
	private boolean completed;
	
}
