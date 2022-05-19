package asdasd.mjeesh.service.account;

import asdasd.mjeesh.model.items.Account;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findById(Long id);
}
