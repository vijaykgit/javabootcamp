/*
 * Copyright 2006-2010 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */
package com.czen.core.model.json;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <pre>
 * This class is used to encapsulate the additionalLimit and endDate value
 * additionalLimit - number of conversations added back to the seeker by CSR
 * endDate - this is the end date for the additional conversations limit to use
 * </pre>
 * 
 * Created Jun 6, 2019 2:49:09 PM
 *
 * @author venkatesh
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversationsAdjustment implements Serializable {

  private Integer limit;
  private Date startDate;

  public ConversationsAdjustment(Integer additionalLimit, Date endDate) {
    this.additionalLimit = additionalLimit;
    this.endDate = endDate;
  }

  public ConversationsAdjustment() {
  }

  public Integer getAdditionalLimit() {
    return additionalLimit;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setAdditionalLimit(Integer additionalLimit) {
    this.additionalLimit = additionalLimit;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
