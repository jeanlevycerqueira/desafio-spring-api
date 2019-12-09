package com.empresa.desafiospring.api.enums;

public enum TipoSexo {
	
	MMASCULINO("m"),
	FEMININO("f");
	
	private final String desc;
	
	private TipoSexo(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
}
