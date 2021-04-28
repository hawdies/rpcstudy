package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcServiceProperties {
    private String version;
    private String group;
    private String serviceName;

    public String toRpcServiceName() {
        return this.getServiceName() + this.getGroup() + this.getVersion();
    }
}
