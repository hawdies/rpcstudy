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
    ZK_ADDRESS("rpc.zookeeper.address");

    private final String propertyValue;
}
