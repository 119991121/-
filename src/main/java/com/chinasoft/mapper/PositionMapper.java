package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.Position;

public interface PositionMapper {
	int insertPosition(Position position);

	int deletePosition(@Param("names")List<String> names);
	
	List<Position> selectAll();
	
	int updatePosition(@Param("pos_id") int pos_id,@Param("departmentID")String departmentID,@Param("new_pos_name")String new_pos_name,@Param("new_pos_desc")String new_pos_desc );
	
	List<Position> selectByname(String positionName);
	
	String selectByid(int positionID);

	List<Position> selectBymessage(String positionMessage);

	Integer getIdByname(String subordinate_dept);
	
}
