package com.isxcode.star.api.work.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 数据同步配置信息.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RetryRule {

    private boolean enable;

    private Integer retryNum;

    private Integer retryInterval;
}
