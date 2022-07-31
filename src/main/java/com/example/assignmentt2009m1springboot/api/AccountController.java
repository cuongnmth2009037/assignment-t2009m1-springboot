package com.example.assignmentt2009m1springboot.api;

import com.example.assignmentt2009m1springboot.entity.dto.AccountRegisterDto;
import com.example.assignmentt2009m1springboot.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    final AccountService accountService;
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody AccountRegisterDto accountRegisterDto){
        return ResponseEntity.ok().body(accountService.register(accountRegisterDto));
    }


    @RequestMapping(method = RequestMethod.GET)
    public String getInformation(){
        return "";
    }
}
