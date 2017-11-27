package br.edu.univa.si8.shopping.ejb.entities;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping_order")

@SequenceGenerator(name = "seq_shopping_order",
sequenceName = "seq_shopping_order",
allocationSize = 1)

public class Product {
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String description;
	private Date tempo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return description;
	}

	public void setName(String name) {
		this.description = name;
	}

	public Date getTempo() {
		return tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}

}
