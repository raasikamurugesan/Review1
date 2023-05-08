package com.example.demo.chocolateRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.chocolateModel.chocoModel1;

//import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
@Repository

public interface chocoRep1 extends JpaRepository<chocoModel1, Integer>
{
	@Query(value="select * from CandyMenu ",nativeQuery=true)
	public List<chocoModel1> getAllData();
	
	@Query(value="select * from CandyMenu where id:id",nativeQuery=true)
	public List<chocoModel1> byid(@Param("id") int id);
	
	@Query(value="select * from CandyMenu where chocolatenum between :start and :end",nativeQuery=true)
    public List<chocoModel1> startEnd(@Param("start") int start,@Param("end")int end);
    
    @Modifying
    @Transactional
    @Query(value="delete from CandyMenu where chocolatenum=?1 and chocolatename=?2",nativeQuery = true)
    Integer deleteD(@Param("pid") int sid,@Param ("name") String pname);
    
    @Modifying
    @Transactional
    @Query(value="update chocoModel1 set chocolatename=:pid where choclatename=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int sid,@Param ("pname")String pname);
    
    @Query(value="select c from chocoModel1 c")
    List<chocoModel1> jpqlQ();
    
    @Query(value="select c from chocoModel1 c where c.id=?1")
    public List<chocoModel1> jqBYCon(@Param ("id")int sid);
}
