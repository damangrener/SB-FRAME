package com.wtf.sbframe.web.mapper.db1;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wtf.sbframe.web.entity.TypechoContents;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

/**
* @author WTF
*/
@DS("db1")
@Mapper
public interface TypechoContentsMapper extends BaseMapper<TypechoContents> {

    @Select("select * from typecho_contents")
    List<TypechoContents> list();

}