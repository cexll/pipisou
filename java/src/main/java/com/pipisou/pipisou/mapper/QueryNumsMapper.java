package com.pipisou.pipisou.mapper;

import com.pipisou.pipisou.model.QueryNums;
import com.pipisou.pipisou.model.QueryNumsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface QueryNumsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    long countByExample(QueryNumsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    int deleteByExample(QueryNumsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    @Delete({
        "delete from querynums",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    @Insert({
        "insert into querynums (link_name, querynum)",
        "values (#{linkName,jdbcType=VARCHAR}, #{querynum,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(QueryNums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    int insertSelective(QueryNums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    List<QueryNums> selectByExampleWithRowbounds(QueryNumsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    List<QueryNums> selectByExample(QueryNumsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    @Select({
        "select",
        "id, link_name, querynum",
        "from querynums",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.pipisou.pipisou.mapper.QueryNumsMapper.BaseResultMap")
    QueryNums selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") QueryNums record, @Param("example") QueryNumsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    int updateByExample(@Param("record") QueryNums record, @Param("example") QueryNumsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    int updateByPrimaryKeySelective(QueryNums record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    @Update({
        "update querynums",
        "set link_name = #{linkName,jdbcType=VARCHAR},",
          "querynum = #{querynum,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(QueryNums record);
}