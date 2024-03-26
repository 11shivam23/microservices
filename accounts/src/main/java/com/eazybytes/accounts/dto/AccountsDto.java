package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the eazy bank account",
            example = "1234567890"
    )
    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "AccountType of the eazy bank account",
            example = "savings"
    )
    @NotEmpty(message = "Account type can not be null or empty")
    private String accountType;

    @Schema(
            description = "AccountType of the eazy bank address",
            example = "vikas puri rohta road meerut"
    )
    @NotEmpty(message = "Branch address can not be null or empty")
    private String branchAddress;
}
