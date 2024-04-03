/*
 * Copyright (c) 2019 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BorrowV3Response {

    private String orderNo;

    private BigDecimal actualSize;
}
