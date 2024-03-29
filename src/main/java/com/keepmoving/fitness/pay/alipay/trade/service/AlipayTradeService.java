package com.keepmoving.fitness.pay.alipay.trade.service;



import com.keepmoving.fitness.pay.alipay.trade.model.builder.AlipayTradePayRequestBuilder;
import com.keepmoving.fitness.pay.alipay.trade.model.result.AlipayF2FPayResult;
import com.keepmoving.fitness.pay.alipay.trade.model.result.AlipayF2FQueryResult;
import com.keepmoving.fitness.pay.alipay.trade.model.builder.*;
import com.keepmoving.fitness.pay.alipay.trade.model.result.*;

/**
 *
 * @author liuyangkly
 * @date 15/7/29
 */
public interface AlipayTradeService {

    /**
     * 当面付2.0流程支付
     *
     * @param builder the builder
     * @return the alipay f 2 f pay result
     */
     AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder);

    /**
     *当面付2.0消费查询
     *
     * @param builder the builder
     * @return the alipay f 2 f query result
     */
     AlipayF2FQueryResult queryTradeResult(AlipayTradeQueryRequestBuilder builder);

    /**
     * 当面付2.0消费退款
     *
     * @param builder the builder
     * @return the alipay f 2 f refund result
     */
     AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder builder);

    /**
     * 当面付2.0预下单(生成二维码)
     *
     * @param builder the builder
     * @return the alipay f 2 f precreate result
     */
     AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder builder);

    /**
     * 当面付2.0 撤销订单
     *
     * @param builder the builder
     * @return the alipay f 2 f cancel result
     */
     AlipayF2FCancelResult tradeCancel_II(AlipayTradeCancelRequestBuilder builder);
}
