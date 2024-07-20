package com.xadmin.SpringBootCrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}