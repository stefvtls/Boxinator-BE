package com.experis.boxinator.services.sender;

import com.experis.boxinator.models.Sender;
import com.experis.boxinator.models.enums.Role;
import com.experis.boxinator.repositories.SenderRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class SenderServiceImpl implements SenderService {

    private final SenderRepository senderRepository;
    public SenderServiceImpl(SenderRepository senderRepository) {
        this.senderRepository  = senderRepository;
    }

    @Override
    public Sender findById(Long id) {
        return senderRepository.getReferenceById(id);
    }

    @Override
    public Collection<Sender> findAll() {
        return senderRepository.findAll();
    }

    @Override
    public Sender add(Sender entity) {
        return senderRepository.save(entity);
    }

    @Override
    public Sender update(Sender entity) {
        return senderRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteById(Long id) {senderRepository.deleteById(id);}

    @Override
    public boolean exists(Long id) {
        return senderRepository.existsById(id);
    }

    public Sender findByEmail(String email){ return senderRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("Sender not found with email " + email));}
    public Sender findByRole(Role role){ return senderRepository.findByRole(role).orElseThrow(() -> new RuntimeException("Sender not found with role " + role));}
}
