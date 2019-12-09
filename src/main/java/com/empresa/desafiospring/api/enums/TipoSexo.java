package com.empresa.desafiospring.api.enums;

public enum TipoSexo {
	
	MASCULINO("m"),
	FEMININO("f");
	
	private final String desc;
	
	private TipoSexo(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
}
