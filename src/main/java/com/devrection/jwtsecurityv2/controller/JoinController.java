package com.devrection.jwtsecurityv2.controller;

import com.devrection.jwtsecurityv2.dto.JoinDTO;
import com.devrection.jwtsecurityv2.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
        joinService.joinProcess(joinDTO);
        return "OK";
    }
}
