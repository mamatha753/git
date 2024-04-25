package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Movies;
//import com.example.demo.exceptions.GenreNotFoundExceptions;
//import com.example.demo.exceptions.IdNotFoundExceptions;
import com.example.demo.repository.MoviesRepository;
//import com.example.demo.responses.ResponseInfo;
@Transactional
@Service("ms")
public class MoviesServiceImpl implements IMoviesService{
	
	@Autowired
	MoviesRepository mr;

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public Movies insertMovies(Movies m) {
		// TODO Auto-generated method stub
		return mr.save(m);
	}
//
//	@Override
//	public Movies getAllByGenre(String g) {
//		// TODO Auto-generated method stub
//		Optional<Movies> om = mr.findByMgenre(g);
//		if(om.isPresent()) {
//			return om.get();
//		}
//		else {
//			throw new GenreNotFoundExceptions("Genre Not found");
//		}
//		
//	}
//
	@Override
	public String deleteMovies(int id) {
		// TODO Auto-generated method stub
		mr.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Movies updateMovies(Movies m) {
		// TODO Auto-generated method stub
		return mr.save(m);
	}



	

}
