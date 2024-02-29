package com.wesleytelesbenette.apicryptography.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CryptographyResponseDto
{
    /**
     * A mensagem retornada ao usuário.
     */
    String messageResponse;

    public CryptographyResponseDto (String message)
    {
        messageResponse = message;
    }
}
