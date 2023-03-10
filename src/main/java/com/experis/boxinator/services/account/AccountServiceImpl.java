package com.experis.boxinator.services.account;

import com.experis.boxinator.models.Account;
import com.experis.boxinator.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.getReferenceById(id);
    }

    @Override
    public Collection<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account add(Account entity) {
        return accountRepository.save(entity);
    }

    @Override
    public Account update(Account entity) {
        return accountRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteById(Long id) {accountRepository.deleteById(id);}

    @Override
    public boolean exists(Long id) {
        return accountRepository.existsById(id);
    }

    public Account findBySubId(Long subId){ return accountRepository.getReferenceById(subId);}

}
