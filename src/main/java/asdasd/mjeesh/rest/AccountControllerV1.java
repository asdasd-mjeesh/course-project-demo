package asdasd.mjeesh.rest;

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

    @Autowired
    public AccountControllerV1(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable("id") Long id) {
        return accountService.findById(id).orElse(null);  // Throw( () -> new Exception("sd"));
    }
}
