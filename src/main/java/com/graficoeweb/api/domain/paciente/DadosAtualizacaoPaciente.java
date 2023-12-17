package com.graficoeweb.api.domain.paciente;

import com.graficoeweb.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        String email,
        @Valid DadosEndereco endereco
) {
}
