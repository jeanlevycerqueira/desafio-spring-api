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
	
	public Usuario() {
	}

	public Usuario(Long idUsuario, String nome, String cpf, TipoSexo sexo, LocalDate dataNascimento, Cargo cargo,
			Perfil perfil, TipoStatus status) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cargo = cargo;
		this.perfil = perfil;
		this.status = status;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public TipoStatus getStatus() {
		return status;
	}

	public void setStatus(TipoStatus status) {
		this.status = status;
	}
	
    
	
}
