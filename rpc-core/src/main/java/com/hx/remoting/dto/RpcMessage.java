package com.hx.remoting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RpcMessage {
    private byte messageType;
    private byte codec;
    private byte compress;
    private int requestId;
    private Object data;
}
