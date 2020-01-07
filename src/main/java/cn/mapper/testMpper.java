package cn.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface testMpper {
     Integer sum(Integer a);
     Integer data();
}
