package com.jxt.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
