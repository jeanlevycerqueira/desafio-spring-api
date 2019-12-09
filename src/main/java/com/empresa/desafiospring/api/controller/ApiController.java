package com.empresa.desafiospring.api.controller;

import java.net.URI;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.empresa.desafiospring.api.util.Codded;

@SuppressWarnings("unchecked")
public abstract class ApiController {

	private static final String ID = "/{id}";

	protected ResponseEntity noContent() {
		return ResponseEntity.noContent().build();
	}

	protected <T extends Object> ResponseEntity ok(@NonNull T resource, @NonNull Function converter) {
		if (resource instanceof Page)
			return ResponseEntity.ok(((Page) resource).stream().map(converter).collect(Collectors.toList()));
		return ResponseEntity.ok(converter.apply(resource));
	}

	protected <T extends Codded> ResponseEntity created(@NonNull T resource, @NonNull Function converter) {
		return ResponseEntity.status(HttpStatus.CREATED).location(getResourceLocation(resource))
				.body(converter.apply(resource));
	}

	
	protected <T extends Codded> URI getResourceLocation(@NonNull T resource) {
	  return ServletUriComponentsBuilder.fromCurrentRequest().path(ID)
			  .buildAndExpand(resource.getId()).toUri(); 
	  }
	 

}
