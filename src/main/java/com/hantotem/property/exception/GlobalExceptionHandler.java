package com.hantotem.property.exception;

import com.hantotem.property.constant.CodeConstant;
import com.hantotem.property.domain.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

import static com.hantotem.property.exception.CommonException.ADDRESS_ALREADY_IN_USE;


/**
 * @author geekerstar
 * @date 2020/6/29 14:14
 * @description 全局异常处理
 */
@Slf4j
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

    /**
     * 手动抛出的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleBusinessException(BusinessException e) {
        log.error("错误码值{},错误信息:{}", e.getCode(), e.getMessage());
        return Response.failed(e.getCode(), e.getMessage());
    }

    /**
     * 统一处理请求参数校验(实体对象传参)
     *
     * @param e MethodArgumentNotValidException
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            message.append(error.getField()).append(":").append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString());
        return Response.failed("G10001", message.toString());
    }

    /**
     * 统一处理请求参数校验(实体对象传参)
     *
     * @param e BindException
     * @return
     */
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleBindException(BindException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            message.append(error.getField()).append(":").append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString());
        return Response.failed("G10002", message.toString());
    }

    /**
     * 端口占用异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(java.net.BindException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleBindException1(java.net.BindException e) {
        e.printStackTrace();
        return Response.failed(ADDRESS_ALREADY_IN_USE);
    }

    /**
     * 未定义的异常处理
     * <p>
     * 2021年03月25日 13:22更新： 成荣冬
     *
     * @param e 捕获到的异常
     * @return 转化成定义的 {@link BusinessException}
     */
    @Order(1)
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleException(Exception e) {
        log.error("系统内部异常，异常信息", e);
        return Response.failed(new BusinessException(CodeConstant.CODE_ERROR, e.getMessage()));
    }
}
