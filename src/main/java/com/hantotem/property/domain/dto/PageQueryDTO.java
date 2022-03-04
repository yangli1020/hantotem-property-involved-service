package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 分页查询 VO
 * @since 2021/3/26 10:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "PageQueryDTO", description = "分页查询(用于程序内部传输)")
public class PageQueryDTO implements Serializable {
    private Integer current;

    private Integer size;

    private String query;

    private Integer state;
}
