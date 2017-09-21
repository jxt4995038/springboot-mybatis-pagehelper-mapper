import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/9/15 0015.
 */
@ControllerAdvice
public class GlobalException {

    public String defaultExceptionHandel(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();
        return null;
    }
}
