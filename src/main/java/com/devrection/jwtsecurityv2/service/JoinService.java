package com.devrection.jwtsecurityv2.service;

import com.devrection.jwtsecurityv2.dto.JoinDTO;
import com.devrection.jwtsecurityv2.entity.UserEntity;
import com.devrection.jwtsecurityv2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;

    public void joinProcess(JoinDTO joinDTO) {
        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        Boolean isExist = userRepository.existsByUsername(username);
        if (isExist) {
            throw new RuntimeException("이미 가입된 아이디입니다.");
        }

        UserEntity data = new UserEntity();
        data.setUsername(username);
        data.setPassword(password);
        data.setRole("ROLE_USER");

        userRepository.save(data);
    }
}
