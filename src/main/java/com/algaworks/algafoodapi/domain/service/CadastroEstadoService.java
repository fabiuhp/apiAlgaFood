package com.algaworks.algafoodapi.domain.service;

import com.algaworks.algafoodapi.domain.model.Estado;
import com.algaworks.algafoodapi.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CadastroEstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado salvar(Estado estado) {
        return estadoRepository.salvar(estado);
    }

    public void excluir(Long estadoId) {
        Estado estado = estadoRepository.buscar(estadoId);

        if (estado == null) {
            throw new EmptyResultDataAccessException(1);
        }

        estadoRepository.remover(estadoId);
    }
}
