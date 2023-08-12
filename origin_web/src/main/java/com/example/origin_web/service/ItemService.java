package com.example.origin_web.service;

import java.util.Date;
import java.util.List;

import com.example.origin_web.dao.ItemsMapper;
import com.example.origin_web.domain.Items;
import com.example.origin_web.domain.ItemsExample;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月8日 下午8:28:32
*/
@Service
@Transactional
public class ItemService {
	
	@Resource
	private ItemsMapper im ;
	
	//查询商品列表
	public List<Items> findAllItems(){
		ItemsExample ie = new ItemsExample();
		List<Items> list = im.selectByExampleWithBLOBs(ie);
		
		return list;
	}
	//通过ID查询商品
	public Items selectItemById(Integer id) {
		Items item = im.selectByPrimaryKey(id);
		return item;
	}
	//修改商品
	public void itemUpdate(Items item) {
		im.updateByPrimaryKeyWithBLOBs(item);
	}
}
