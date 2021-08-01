package com.minhaLojaDeGames.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Categoria {
	@Entity
	@Table(name = "Categoria")
	public class Postagem {

		@Id // INORMANDO QUE É O ID
		@GeneratedValue(strategy = GenerationType.IDENTITY) // USADO JUNTO COM ID //IDENTITY É AUTO INCRMENT// PRIMARY KEY
		private long id;

		@NotNull // NÃO RECEBER VALOR NULO
		@Size(min = 5, max = 100) // PARAMETROS DE QUANTIDADE CARACTER
		private String titulo;

		@NotNull // NÃO RECEBER VALOR NULO
		@Size(min = 10, max = 100) // PARAMETROS DE QUANTIDADE CARACTER
		private String descricao;

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

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
