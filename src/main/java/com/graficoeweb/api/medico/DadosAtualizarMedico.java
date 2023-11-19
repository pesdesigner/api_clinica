package com.graficoeweb.api.medico;

import com.graficoeweb.api.endereco.DadosEndereco;
import com.graficoeweb.api.especialidade.Especialidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(

    @NotNull
    Long id,

    String nome,

    String email,

    String telefone,

    DadosEndereco endereco

    ) {
}
