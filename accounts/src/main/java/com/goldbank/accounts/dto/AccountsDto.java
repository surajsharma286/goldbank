package com.goldbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name="Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digit")
    @Schema(
            description = "Account Number of Goldbank Customer"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type Can not be null or empty")
    @Schema(
            description = "Account Type of Goldbank Customer", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch Address Can not be null or empty")
    @Schema(
            description = "Goldbank Branch Address", example = "123 NYC, New York"
    )
    private String branchAddress;
}
