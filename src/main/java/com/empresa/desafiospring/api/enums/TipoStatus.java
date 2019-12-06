package com.empresa.desafiospring.api.enums;

public enum TipoStatus {
	
    ATIVO(0),
    INATIVO(1);
    
	private final Integer val;

	TipoStatus(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
		return val;
	}
}
