package com.example.web_regenerate.dao;

import com.example.web_regenerate.domain.Items;
import com.example.web_regenerate.domain.ItemsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Mapper
public interface ItemsMapper {
    /* Here is the explanation for the code above:
1. The interface ItemMapper is an interface to map the Item class to the item table in the database.
2. The interface ItemMapper extends the interface Mapper<Item>, which provides several methods for CRUD operations.
3. The interface ItemMapper is annotated with the annotation @Repository. This annotation is used to indicate that the interface is a repository or DAO.
4. The interface ItemMapper has a method countByExample(ItemsExample example) to count the number of records in the item table.
5. The interface ItemMapper has a method deleteByExample(ItemsExample example) to delete records from the item table.
6. The interface ItemMapper has a method deleteByPrimaryKey(Integer id) to delete a record from the item table.
7. The interface ItemMapper has a method insert(Items record) to insert a record into the item table.
8. The interface ItemMapper has a method insertSelective(Items record) to insert a record into the item table.
9. The interface ItemMapper has a method selectByExampleWithBLOBs(ItemsExample example) to select records from the item table.
10. The interface ItemMapper has a method selectByExample(ItemsExample example) to select records from the item table.
11. The interface ItemMapper has a method selectByPrimaryKey(Integer id) to select a record from the item table.
12. The interface ItemMapper has a method updateByExampleSelective(Items record, ItemsExample example) to update records in the item table.
13. The interface ItemMapper has a method updateByExampleWithBLOBs(Items record, ItemsExample example) to update records in the item table.
14. The interface ItemMapper has a method updateByExample(Items record, ItemsExample example) to update records in the item table.
15. The interface ItemMapper has a method updateByPrimaryKeySelective(Items record) to update a record in the item table.
16. The interface ItemMapper has a method updateByPrimaryKeyWithBLOBs(Items record) to update a record in the item table.
17. The interface ItemMapper has a method updateByPrimaryKey(Items record) to update a record in the item table. */
    long countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    List<Items> selectByExampleWithBLOBs(ItemsExample example);

    List<Items> selectByExample(ItemsExample example);

    Items selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKeyWithBLOBs(Items record);

    int updateByPrimaryKey(Items record);
}
