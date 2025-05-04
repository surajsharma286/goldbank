package com.goldbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name ="Response", description = "Schema to Hold Successful Response"
)
@AllArgsConstructor
@Data
public class ResponseDto {

    @Schema(
            description = "Status Code in the Response"
    )
    private String statusCode;

    @Schema(
            description = "Status Message in the Response"
    )
    private String statusMsg;
}
