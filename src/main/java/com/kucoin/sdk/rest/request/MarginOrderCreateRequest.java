/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @since 2018-09-17
 */
@Builder
@Data
public class MarginOrderCreateRequest {

    /**
     * a valid trading symbol code. e.g. ETH-BTC
     */
    private final String symbol;

    /**
     * [optional] limit or market (default is limit)
     */
    @Builder.Default
    private final String type = "limit";

    /**
     * buy or sell
     */
    private final String side;

    /**
     * price per base currency
     */
    private final BigDecimal price;

    /**
     * amount of base currency to buy or sell
     */
    private final BigDecimal size;

    /**
     * [optional] Desired amount of quote currency to use
     */
    private final BigDecimal funds;

    /**
     * [optional] self trade protect , CN, CO, CB or DC
     */
    @Builder.Default
    private final String stp = "";

    /**
     * [optional] Either loss or entry. Requires stopPrice to be defined
     */
    @Builder.Default
    private final String stop = "";

    /**
     * [optional] Only if stop is defined. Sets trigger price for stop order
     */
    private final BigDecimal stopPrice;

    /**
     * [optional] GTC, GTT, IOC, or FOK (default is GTC)
     */
    @Builder.Default
    private final String timeInForce = "GTC";

    /**
     * [optional] * cancel after n seconds
     */
    private final long cancelAfter;

    /**
     * [optional] ** Post only flag
     */
    private final boolean postOnly;

    /**
     * [optional] Orders not displayed in order book
     */
    private final boolean hidden;

    /**
     * [optional] Only visible portion of the order is displayed in the order book
     */
    private final boolean iceberge;

    /**
     * [optional] The maximum visible size of an iceberg order
     */
    private final BigDecimal visibleSize;

    /**
     * Unique order id selected by you to identify your order e.g. UUID
     */
    private String clientOid;

    /**
     * [optional] remark for the order, length cannot exceed 100 utf8 characters
     */
    private final String remark;

    /**
     *[Optional] Auto-borrow to place order. The system will first borrow you funds at the optimal interest rate
     * and then place an order for you.
     */
    private Boolean autoBorrow;

    /**
     * [Optional] The type of trading, including cross (cross mode) and isolated (isolated mode). It is set at cross by default.
     * The isolated mode will be released soon, so stay tuned!
     */
    @Builder.Default
    private String marginModel = "cross";

}
