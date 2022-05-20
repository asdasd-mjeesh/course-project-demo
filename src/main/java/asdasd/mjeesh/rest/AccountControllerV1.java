package asdasd.mjeesh.rest;

import asdasd.mjeesh.mapper.AccountFactory;
import asdasd.mjeesh.model.dto.AccountDto;
import asdasd.mjeesh.model.items.Account;
import asdasd.mjeesh.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountControllerV1 {
    private final AccountService accountService;
    private final AccountFactory accountFactory;

    @Autowired
    public AccountControllerV1(AccountService accountService, AccountFactory accountFactory) {
        this.accountService = accountService;
        this.accountFactory = accountFactory;
    }

    @GetMapping("/{id}")
    public AccountDto getById(@PathVariable("id") Long id) {
        Account account = accountService.findById(id).orElse(null);  // Throw( () -> new Exception("sd"));
        return accountFactory.map(account);
    }
}
