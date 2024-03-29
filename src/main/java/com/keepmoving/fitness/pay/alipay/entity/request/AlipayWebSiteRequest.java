package com.keepmoving.fitness.pay.alipay.entity.request;

import com.google.gson.annotations.SerializedName;
import org.thlws.utils.JsonUtil;


/**
 * 支付宝网站支付参数对象
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayWebSiteRequest {

    /**业务数据填充,json格式*/
    private BizContent bizContent   ;

    /**同步处理地址*/
    private String returnUrl       ;

    /**异步处理地址*/
    private String notifyUrl       ;

    /**
     * Gets biz content.
     *
     * @return the biz content
     */
    public BizContent getBizContent() {
        return bizContent;
    }

    /**
     * Sets biz content.
     *
     * @param bizContent the biz content
     */
    public void setBizContent(BizContent bizContent) {
        this.bizContent = bizContent;
    }

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets return url.
     *
     * @param returnUrl the return url
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * The type Biz content.
     */
    public static class BizContent{

        @SerializedName(value = "out_trade_no")
        private String outTradeNo  ;

        @SerializedName(value = "total_amount")
        private String totalAmount  ;
        private String subject       ;
        private String body          ;

        /***
         * 电脑网站支付应该是常量值'FAST_INSTANT_TRADE_PAY'
         * @see <a href="https://docs.open.alipay.com/api_1/alipay.trade.page.pay">https://docs.open.alipay.com/api_1/alipay.trade.page.pay</a>
         */
        @SerializedName(value = "product_code")
        private String productCode = "FAST_INSTANT_TRADE_PAY"  ;

        /**
         * Gets out trade no.
         *
         * @return the out trade no
         */
        public String getOutTradeNo() {
            return outTradeNo;
        }

        /**
         * Sets out trade no.
         *
         * @param outTradeNo the out trade no
         */
        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        /**
         * Gets total amount.
         *
         * @return the total amount
         */
        public String getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets total amount.
         *
         * @param totalAmount the total amount
         */
        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        /**
         * Gets subject.
         *
         * @return the subject
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Sets subject.
         *
         * @param subject the subject
         */
        public void setSubject(String subject) {
            this.subject = subject;
        }

        /**
         * Gets body.
         *
         * @return the body
         */
        public String getBody() {
            return body;
        }

        /**
         * Sets body.
         *
         * @param body the body
         */
        public void setBody(String body) {
            this.body = body;
        }

        /**
         * Gets product code.
         *
         * @return the product code
         */
        public String getProductCode() {
            return productCode;
        }

    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
