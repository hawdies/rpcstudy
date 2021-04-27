package com.hx.remoting.transport;

import com.hx.remoting.dto.RpcRequest;

/**
 * @author hawdies
 * @date 2021/4/27
 **/
public interface RpcRequestTransport {
    Object sendRequest(RpcRequest rpcRequest);
}
