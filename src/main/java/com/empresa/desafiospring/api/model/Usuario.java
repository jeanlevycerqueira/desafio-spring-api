package com.empresa.desafiospring.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.empresa.desafiospring.api.enums.TipoSexo;
import com.empresa.desafiospring.api.enums.TipoStatus;
import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = -5111043654037655903L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long idUsuario;
	
	@Column(name = "nome_usuario", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "cpf_usuario", nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "sexo_usuario", nullable = false)
	private TipoSexo sexo;
	
	@Column(name = "dt_nascimento_usuario", nullable = false)
	private LocalDate dataNascimento;
	
	@OneToOne
	@JoinColumn(name="id_cargo", nullable=false)
	private Cargo cargo;
	
	@OneToOne 
	@JoinColumn(name="id_perfil", nullable=true)
	private Perfil perfil;
	
	@Column(name = "status_usuario", nullable = false)
	private TipoStatus status;
	
		
}
