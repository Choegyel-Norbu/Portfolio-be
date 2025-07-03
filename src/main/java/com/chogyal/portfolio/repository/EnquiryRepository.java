package com.chogyal.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chogyal.portfolio.model.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long>{

}
