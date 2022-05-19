package asdasd.mjeesh.service.account;

import asdasd.mjeesh.model.items.Account;
import asdasd.mjeesh.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }
}
