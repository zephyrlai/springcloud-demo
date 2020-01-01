package cn.zephyr.framework;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: GlobalExceptionHandler
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/1/1 17:42
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @Resource
    private HttpServletResponse response;

    @ExceptionHandler(value =RuntimeException.class)
    public void exceptionHandler(Exception e) throws IOException {
        System.out.println("系统错误！原因是:"+e);
        PrintWriter writer = response.getWriter();
        writer.print("service not available");

    }
}
