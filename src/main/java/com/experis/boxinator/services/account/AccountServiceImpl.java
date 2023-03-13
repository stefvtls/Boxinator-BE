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
    public Account findById(Long id)
    {
        return accountRepository.getReferenceById(id);
    }

    @Override
    public Collection<Account> findAll() {
        return null;
    }

    @Override
    public Account add(Account entity) {
        return null;
    }

    @Override
    public Account update(Account entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }
}
