package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author hawdies
 * @date 2021/4/28
 **/
@AllArgsConstructor
@Getter
public enum  RpcConfigEnum {
    RPC_CONFIG_PATH("rpc.properties"),
    ZK_ADDRESS("rpc.zookeeeper.addresss");

    private final String propertyValue;
}
