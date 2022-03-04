package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author geekerstar
 * @date 2021/3/26 17:59
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RemoveDocumentDTO", description = "文书删除入参")
public class RemoveDocumentDTO {

    @NotNull(message = "id")
    @ApiModelProperty("id")
    private Long id;
}
