package com.wesleytelesbenette.apicryptography.controllers;

import com.wesleytelesbenette.apicryptography.dtos.CryptographyRequestDto;
import com.wesleytelesbenette.apicryptography.dtos.CryptographyResponseDto;
import com.wesleytelesbenette.apicryptography.services.CryptographyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cryptography")
public class Cryptography
{
    @PostMapping("/encrypt")
    public ResponseEntity<CryptographyResponseDto> encryptMessage(@RequestBody @Valid CryptographyRequestDto request)
    {
        String response = CryptographyService.encrypt(request.getMessage(), request.getKey());
        return (!response.equals(""))
            ? ResponseEntity.ok(new CryptographyResponseDto(response))
            : ResponseEntity.internalServerError().build();
    }

    @PostMapping("/decrypt")
    public ResponseEntity<CryptographyResponseDto> decryptMessage(@RequestBody @Valid CryptographyRequestDto request)
    {
        String response = CryptographyService.decrypt(request.getMessage(), request.getKey());
        return (!response.equals(""))
                ? ResponseEntity.ok(new CryptographyResponseDto(response))
                : ResponseEntity.internalServerError().build();
    }
}
