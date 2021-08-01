package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "postagem")
public class Postagem {

	@Id // INORMANDO QUE É O ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // USADO JUNTO COM ID //IDENTITY É AUTO INCRMENT// PRIMARY KEY
	private long id;

	@NotNull // NÃO RECEBER VALOR NULO
	@Size(min = 5, max = 100) // PARAMETROS DE QUANTIDADE CARACTER
	private String titulo;

	@NotNull // NÃO RECEBER VALOR NULO
	@Size(min = 10, max = 100) // PARAMETROS DE QUANTIDADE CARACTER
	private String texto;

	@Temporal(TemporalType.TIMESTAMP) // QUAL TIPO DE TEMPO
	private Date date = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
}
