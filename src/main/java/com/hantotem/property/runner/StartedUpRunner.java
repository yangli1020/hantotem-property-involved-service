package com.hantotem.property.runner;


import com.hantotem.property.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author geekerstar
 * @date 2020/11/23 11:35
 * @description
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class StartedUpRunner implements ApplicationRunner {

    @Value("${server.port:19700}")
    private String port;

    @Override
    public void run(ApplicationArguments args) {
        log.info("++++++++++++++++++++++++++++++++++++++++++++++++++");
        String url = String.format("http://%s:%s%s", String.valueOf(CommonUtil.getInet4Address()).replace("/", ""), port, "/doc.html");
        log.info("【涉案财物中心】启动成功!");
        log.info("【Swagger】{}", url);
        log.info("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

