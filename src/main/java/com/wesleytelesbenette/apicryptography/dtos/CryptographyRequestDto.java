package com.wesleytelesbenette.apicryptography.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CryptographyRequestDto
{
    /**
     * A mensagem que o usuário deseja criptografar
     *
     *  @NotBlank A mensagem não pode estar em branco.
     */
    @NotBlank(message = "A mensagem não pode estar em branco.")
    private String message;

    /**
     * A senha usada para criptografar a mensagem, o mesma será necessário para fazer o processo de descriptografia.
     *
     * @NotBlank A chave de criptografia não pode estar em branco.
     */
    @NotBlank(message = "A chave de criptografia não pode estar em branco.")
    private String key;
}
