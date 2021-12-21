package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Cource;

public interface CourceService {
	public List<Cource>getCource();
	public Cource getCource(long courceId);
	public Cource addCource(Cource cource);
	public Cource updateCource(Cource cource);
	public boolean deleteCource(long courceId);
}
