package com.erpcontrole.erp.service;

import com.erpcontrole.erp.model.ItemVenda;
import com.erpcontrole.erp.repository.ItemVendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemVendaService {

    private final ItemVendaRepository itemVendaRepository;

    public ItemVendaService(ItemVendaRepository itemVendaRepository) {
        this.itemVendaRepository = itemVendaRepository;
    }

    public List<ItemVenda> listarTodos() {
        return itemVendaRepository.findAll();
    }

    public ItemVenda salvar(ItemVenda item) {
        return itemVendaRepository.save(item);
    }

    public void deletar(Long id) {
        itemVendaRepository.deleteById(id);
    }
}

