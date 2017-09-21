package com.jxt.mapper;

import com.jxt.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
public interface TestMapper extends MyMapper {

    String testA();

    List<Map<String,Object>> testDto(@Param("region") String region);
}
