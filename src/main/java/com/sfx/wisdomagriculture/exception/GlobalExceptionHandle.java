package com.sfx.wisdomagriculture.exception;

import com.sfx.wisdomagriculture.comment.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @author SFX
 * 全局异常捕获
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    /**
     * 验证类异常，空
     * @param exception
     * @return
     */
    @ExceptionHandler(CheckException.class)
    @org.springframework.web.bind.annotation.ResponseBody
    public ResultBean customGenericExceptionHnadler(CheckException exception) {
        return new ResultBean(exception.getLocalizedMessage(),false);
    }

    /**
     * 业务处理异常
     * @param exception
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResultBean businessExceptionExceptionHnadler(BusinessException exception) {
        return new ResultBean(exception.getLocalizedMessage(),false);
    }




    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean exceptionHandler(HttpServletRequest request, Exception e){
        e.printStackTrace();
        return new ResultBean(e.getLocalizedMessage(),false);
    }
}
