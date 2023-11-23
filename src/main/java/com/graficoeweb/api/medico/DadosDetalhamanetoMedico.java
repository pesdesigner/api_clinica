package com.graficoeweb.api.medico;

import com.graficoeweb.api.endereco.Endereco;
import com.graficoeweb.api.especialidade.Especialidade;

public record DadosDetalhamanetoMedico(Long id, String nome, String email, String telefone, String crm, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamanetoMedico(Medico medico) {
        this(
            medico.getId(),
            medico.getNome(),
            medico.getEmail(),
            medico.getTelefone(),
            medico.getCrm(),
            medico.getEspecialidade(),
            medico.getEndereco()
        );
    }
}
