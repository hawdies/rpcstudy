package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author hawdies
 * @date 2021/4/27
 **/

@AllArgsConstructor
@Getter
@ToString
public enum RpcResponseCodeEnum {
    SUCCESS(200, "The remote call is successful."),
    FAIL(500, "The remote call is fail");
    private final int code;
    private final String message;
}
