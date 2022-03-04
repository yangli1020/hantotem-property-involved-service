package com.hantotem.property.controller.stock;

import com.hantotem.property.common.BaseController;
import com.hantotem.property.domain.common.Response;
import com.hantotem.property.domain.dto.CaseInfoDTO;
import com.hantotem.property.domain.dto.ItemSaveDTO;
import com.hantotem.property.domain.entity.GaSacwAjxxb;
import com.hantotem.property.domain.vo.AjSaveVO;
import com.hantotem.property.domain.vo.ItemVO;
import com.hantotem.property.service.StockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/stock")
@Api(tags = "出入库")
@RequiredArgsConstructor
public class StockController extends BaseController {

    private final StockService stockService;

    @PostMapping("/instock/caseRelate")
    @ApiOperation(value = "案件关联", notes = "案件关联-魏星，查询到案件后建立案件关联，返回前端操作编号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "caseInfoDTO", value = "案件关联入参", paramType = "body", dataType = "CaseInfoDTO", required = true)
    })
    public Response<String> caseRelate(@Validated @RequestBody CaseInfoDTO caseInfoDTO){
        return Response.success(stockService.caseRelate(getIdStr(),caseInfoDTO));

    }
    @RequestMapping("/in/saveItem")
    @ApiOperation(value = "新增/编辑物品", notes = "新增/编辑物品，wpbh不传或为空为新增物品，wpbh不为空为编辑物品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "itemSaveDTO", value = "新增/编辑物品入参", paramType = "body", dataType = "ItemSaveDTO", required = true)
    })
    public Response<String> saveItem(@RequestBody ItemSaveDTO itemSaveDTO){
        stockService.saveItem(getIdStr(), itemSaveDTO);
        return  Response.success();

    }
}
