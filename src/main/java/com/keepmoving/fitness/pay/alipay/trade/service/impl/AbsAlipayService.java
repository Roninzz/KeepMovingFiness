package com.keepmoving.fitness.pay.alipay.trade.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.keepmoving.fitness.pay.alipay.trade.model.builder.RequestBuilder;


/**
 * Created by liuyangkly on 15/10/22.
 */
abstract class AbsAlipayService {
    /**
     * The Log.
     */
    protected Log log = LogFactory.getLog(getClass());

    /**
     * Validate builder.
     *
     * @param builder the builder
     */
// 验证bizContent对象
    protected void validateBuilder(RequestBuilder builder) {
        if (builder == null) {
            throw new NullPointerException("builder should not be NULL!");
        }

        if (!builder.validate()) {
            throw new IllegalStateException("builder validate failed! " + builder.toString());
        }
    }

    /**
     * Gets response.
     *
     * @param client  the client
     * @param request the request
     * @return the response
     */
// 调用AlipayClient的execute方法，进行远程调用
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected AlipayResponse getResponse(AlipayClient client, AlipayRequest request) {
        try {
            AlipayResponse response = client.execute(request);
            if (response != null) {
                log.debug(response.getBody());
            }
            return response;

        } catch (AlipayApiException e) {
            e.printStackTrace();
            return null;
        }
    }
}
