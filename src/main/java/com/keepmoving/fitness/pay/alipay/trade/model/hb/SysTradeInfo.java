package com.keepmoving.fitness.pay.alipay.trade.model.hb;

import com.google.gson.annotations.SerializedName;


/**
 *
 * @author liuyangkly
 * @date 15/8/27
 */
public class SysTradeInfo implements TradeInfo {

    @SerializedName("OTN")
    private String outTradeNo;

    @SerializedName("TC")
    private double timeConsume;

    @SerializedName("STAT")
    private HbStatus status;

    private SysTradeInfo() {
        // no public constructor.
    }

    /**
     * New instance sys trade info.
     *
     * @param outTradeNo  the out trade no
     * @param timeConsume the time consume
     * @param status      the status
     * @return the sys trade info
     */
    public static SysTradeInfo newInstance(String outTradeNo, double timeConsume,HbStatus status) {
        SysTradeInfo info = new SysTradeInfo();
        info.setOutTradeNo(outTradeNo);
        if (timeConsume > 99 || timeConsume < 0) {
            timeConsume = 99;
        }
        info.setTimeConsume(timeConsume);
        info.setStatus(status);
        return info;
    }

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

    @Override
    public HbStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(HbStatus status) {
        this.status=status;
    }

    @Override
    public double getTimeConsume() {
        return timeConsume;
    }

    /**
     * Sets time consume.
     *
     * @param timeConsume the time consume
     */
    public void setTimeConsume(double timeConsume) {
        this.timeConsume = timeConsume;
    }
}
