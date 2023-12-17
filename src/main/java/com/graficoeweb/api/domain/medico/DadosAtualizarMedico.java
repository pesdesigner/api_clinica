package com.graficoeweb.api.domain.medico;

import com.graficoeweb.api.domain.endereco.DadosEndereco;
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
