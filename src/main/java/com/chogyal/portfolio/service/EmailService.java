package com.chogyal.portfolio.service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.chogyal.portfolio.model.EmailOTP;
import com.chogyal.portfolio.repository.EmailOTPRepository;
import com.chogyal.portfolio.repository.UserRepository;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	EmailOTPRepository emailOtpRepository;
	
	public void sendOtpEmail(String email, String otp) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Your OTP Code");
        message.setText("Your OTP is: " + otp + " (valid for 5 minutes)");
        
        mailSender.send(message);
	}
	
	public void generateOtpAndSendOtp(String email) {
		String otp = String.valueOf(new Random().nextInt(900000) + 100000); // 6-digit OTP
        LocalDateTime expiryTime = LocalDateTime.now().plusMinutes(5);
        
        EmailOTP emailOtp = new EmailOTP();
        emailOtp.setEmail(email);
        emailOtp.setOtp(otp);
        emailOtp.setExpiryTime(expiryTime);
        emailOtp.setUsed(false);
        
        emailOtpRepository.save(emailOtp);
        sendOtpEmail(email, otp);
	}
	
	public boolean validateOtp(String email, String otp) {
		Optional<EmailOTP> otpOptional = emailOtpRepository.findByEmailAndOtp(email, otp);

        if (otpOptional.isPresent()) {
            EmailOTP emailOTP = otpOptional.get();
            if (emailOTP.getExpiryTime().isAfter(LocalDateTime.now())) {
                emailOTP.setUsed(true);
                emailOtpRepository.save(emailOTP);
                return true;
            }
        }
        return false;
    }

}
