package com.example.AWS.controller.repository;

import com.example.AWS.controller.libraryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<libraryBean, String > {

}
