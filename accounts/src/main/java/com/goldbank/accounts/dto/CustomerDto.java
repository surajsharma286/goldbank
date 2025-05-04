package com.goldbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer", example = "John Doe", required = true
    )
    @NotEmpty(message = "Name Can not be null or empty")
    @Size(min = 5, max = 30, message = "Name should have at least 2 characters")
    private String name;

    @Schema(
            description = "Email of the Customer", example = "john.doe@goldbank.com", required = true
    )
    @NotEmpty(message = "Email Can not be null or empty")
    @Email(message = "Please enter a valid email address")
    private String email;

    @Schema(
            description = "Mobile Number of the Customer", example = "9345612345"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Please enter a valid mobile number")
    private String mobileNumber;

    @Schema(
            description = "Accounts Details of the Customer"
    )
    private AccountsDto accountsDto;

}
