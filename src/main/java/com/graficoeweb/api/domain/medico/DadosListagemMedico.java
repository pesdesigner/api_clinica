package com.graficoeweb.api.domain.medico;

import com.graficoeweb.api.domain.especialidade.Especialidade;

public record DadosListagemMedico(Long id ,String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId() ,medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
