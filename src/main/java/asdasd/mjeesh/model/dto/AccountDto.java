package asdasd.mjeesh.model.dto;

import asdasd.mjeesh.model.Role;

public record AccountDto(Long id,
                         String username,
                         Role role) {
}
