package com.hantotem.property.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description TODO
 * @ClassName SjjhConstans
 * @Author luxiang
 * @Date 2021-12-08
 * @Version 1.0
 **/
@Component
@Data
public class SjjhConstans {

    private static String SSDWSUB;
    private static String BAQTSURL;
    private static String BAQSJJHUUID;
    private static String BAQSJJHUSERId;
    private static String BAQSJJHLICENSEKEY;
    private static Integer SFTS = null;

    @Value("${sjjh.SSDWSUB:\"\"}")
    private String sjjhSsdwSub;

    @Value("${sjjh.BAQTSURL:\"\"}")
    private String sjjhUrl;

    @Value("${sjjh.BAQSJJHUUID:\"\"}")
    private String sjjhUuid;

    @Value("${sjjh.BAQSJJHUSERId:\"\"}")
    private String sjjhUserid;

    @Value("${sjjh.BAQSJJHLICENSEKEY:\"\"}")
    private String sjjhKey;

    @Value("${sjjh.SFTS:0}")
    private Integer sjjhSfts;

    @PostConstruct
    public void getConfig(){
        SSDWSUB = this.sjjhSsdwSub;
        BAQTSURL = this.sjjhUrl;
        BAQSJJHUUID = this.sjjhUuid;
        BAQSJJHUSERId = this.sjjhUserid;
        BAQSJJHLICENSEKEY = this.sjjhKey;
        SFTS = this.sjjhSfts;
    }

    public static  String getSSDWSUB(){
        return SSDWSUB;
    }
    public static  String getBAQTSURL(){
        return BAQTSURL;
    }
    public static  String getBAQSJJHUUID(){
        return BAQSJJHUUID;
    }
    public static  String getBAQSJJHUSERId(){
        return BAQSJJHUSERId;
    }
    public static  String getBAQSJJHLICENSEKEY(){
        return BAQSJJHLICENSEKEY;
    }
    public static  Integer getSFTS(){
        return SFTS;
    }

}
