package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Cource;

@Service
public class CourceServiceImpl implements CourceService {
	
	List<Cource> list;
	public CourceServiceImpl() {
		list = new ArrayList<>();
		list.add(new Cource(145,"Java core cource","this cource contains basics of java"));
		list.add(new Cource(123,"spring boot cource","creating new cource"));
	}

	@Override
	public List<Cource> getCource() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Cource getCource(long courceId) {
		
		Cource a = null;
		for (Cource cource : list) {
			if(cource.getId() == courceId) {
				a= cource;
				break;
			}
		
		}
		return a;
	}

	@Override
	public Cource addCource(Cource cource) {
		list.add(cource);
		return cource;
	}

	@Override
	public Cource updateCource(Cource cource) {
		list.set(1, cource);
		return cource;
	}

	@Override
	public boolean deleteCource(long courceId) {
		boolean a = false;
		for (Cource cource : list) {
			if(cource.getId() == courceId) {
				a=list.remove(cource);
				break;
			}
		
		}
		return a;
	}

}
