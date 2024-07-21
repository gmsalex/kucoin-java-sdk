/*
 * Copyright (c) 2019 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class InterestV3Response {

    private Date createdAt;
    private String currency;
    private BigDecimal interestAmount;
    private BigDecimal dayRatio;
}
