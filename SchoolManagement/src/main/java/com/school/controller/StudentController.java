package com.school.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.ClassRepo;
import com.school.repository.SchoolRepo;
import com.school.repository.StudentRepo;
import com.school.repository.TeacherRepo;

@RestController
@RequestMapping("/student/")
public class StudentController {
	@Autowired
	private StudentRepo repo;
	@Autowired
	private ClassRepo clsRepo;
	@Autowired
	private SchoolRepo schoolRepo;
	@Autowired
	private TeacherRepo teRepo;

	@GetMapping("fetchTeachers")
	public @ResponseBody Map<String, Object> fetchTeachers(
			@RequestParam(value = "name", required = false) String student

	) {
		Map<String, Object> result = new HashMap<String, Object>();
		System.out.println("***************************");

		try {
			Iterable<Teacher> getTeachers = teRepo.findAll();
			result.put("data", getTeachers);
			result.put("message", "success");
		} catch (Exception e) {

			e.printStackTrace();
			result.put("message", "fail");
		}
		return result;
	}

	@PostMapping("createStudent")
	public @ResponseBody Map<String, Object> createStudent(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "age", required = false) String age

	) {
		Map<String, Object> result = new HashMap<String, Object>();

		try {
			Student s = new Student();
			s.setsName(name);
			s.setsAge(age);
			repo.save(s);
			result.put("message", "success");
		} catch (Exception e) {
			result.put("message", "fail");
			e.printStackTrace();

		}
		return result;
	}

	@PostMapping("readStudent")
	public @ResponseBody Map<String, Object> readStudent(@RequestParam(value = "name", required = false) String name) {
		Map<String, Object> result = new HashMap<String, Object>();

		try {
			List<Student> std = repo.findBySName(name);
			result.put("data", std);
		} catch (Exception e) {
			result.put("message", "fail");
			e.printStackTrace();

		}
		return result;
	}

	@PostMapping("deleteStudent")
	public @ResponseBody Map<String, Object> deleteStudent(@RequestParam(value = "sId", required = false) String id) {
		Map<String, Object> result = new HashMap<String, Object>();

		try {
			repo.delete(Long.parseLong(id));
			result.put("message", "success");
		} catch (Exception e) {
			result.put("message", "fail");
			e.printStackTrace();

		}
		return result;
	}
}
