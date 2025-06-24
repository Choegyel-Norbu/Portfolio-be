package com.chogyal.portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chogyal.portfolio.model.EmailOTP;

@Repository
public interface EmailOTPRepository extends JpaRepository<EmailOTP, Long> {
	Optional<EmailOTP> findByEmailAndOtp(String email, String otp);
}
