package asdasd.mjeesh.mapper;

import asdasd.mjeesh.model.dto.AccountDto;
import asdasd.mjeesh.model.items.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountFactory implements MapperFactory<AccountDto, Account> {

    @Override
    public AccountDto map(Account account) {
        return new AccountDto(
                account.getId(),
                account.getUsername(),
                account.getRole()
        );
    }
}
