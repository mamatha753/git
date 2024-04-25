package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Movies;

import com.example.demo.services.IMoviesService;

@RestController
public class MovieController {

	@Autowired
	IMoviesService ms;
	
	@GetMapping("/get")
	public ResponseEntity<List<Movies>> showData(){
		return new ResponseEntity<List<Movies>>(ms.getAllMovies(),HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Movies> insertData(@RequestBody Movies m){
		Movies mdata = ms.insertMovies(m);
		return new ResponseEntity<Movies>(mdata,HttpStatus.OK);
	}
	@DeleteMapping("/deletebyId/{mid}")
	public String deleteMovies(@PathVariable("mid")int id) {
		return ms.deleteMovies(id);
		
	}
	
	@PutMapping("/get")
	public Movies updateMovies(@RequestBody Movies m) {
		return ms.updateMovies(m);
		
	}
	
}
