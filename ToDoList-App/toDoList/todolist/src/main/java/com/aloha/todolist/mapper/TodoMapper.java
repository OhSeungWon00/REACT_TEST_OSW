package com.aloha.todolist.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.todolist.domain.Todos;

@Mapper
public interface TodoMapper extends BaseMapper<Todos> {

    // 전체 완료
    public int completeAll() throws Exception;

    // 전체 삭제
    public int deleteAll() throws Exception;

}
