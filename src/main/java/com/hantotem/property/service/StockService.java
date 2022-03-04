package com.hantotem.property.service;

import com.hantotem.property.domain.common.Response;
import com.hantotem.property.domain.dto.CaseInfoDTO;
import com.hantotem.property.domain.dto.ItemSaveDTO;
import org.springframework.stereotype.Service;


public interface StockService {
    /**
     * 案件关联
     * @param idStr 任务ID
     * @param caseInfoDTO 案件关联传入的参数
     * @return 操作编号
     */
    String caseRelate(String idStr, CaseInfoDTO caseInfoDTO);

    void saveItem(String idStr, ItemSaveDTO itemSaveDTO);
}
