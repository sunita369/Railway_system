package com.railway.MainAdmin.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.MainAdmin.models.MainAdminModel;
import com.railway.MainAdmin.repositories.MainAdminRepository;

@RestController
@RequestMapping("/Admins")
public class MainAdminController {
	
	@Autowired
	private MainAdminRepository repo;
	
	@PostMapping("/addAdmin")
	public String saveBook(@RequestBody MainAdminModel admin) {
		repo.save(admin);
		return "added Admin with id:" + admin.getId();
	}
	
	@GetMapping("/findAllAdmin")
	public List<MainAdminModel> getBooks(){
		return repo.findAll();
	}
	
	@GetMapping("/findAllAdmin/{id}")
	public Optional<MainAdminModel> getBook(@PathVariable String id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		repo.deleteById(id);
		return "Admin deleted with id:" +id;
	}
	
	@PutMapping("/update/{id}")
	public MainAdminModel updateBook(@PathVariable String id, @RequestBody MainAdminModel admin) {
		admin.setId(id);
		repo.save(admin);
		return admin;
	}


}
