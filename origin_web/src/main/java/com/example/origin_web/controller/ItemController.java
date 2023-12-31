package com.example.origin_web.controller;

import java.util.List;

import com.example.origin_web.domain.Items;
import com.example.origin_web.service.ItemService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月8日 下午7:36:33
*/
@Controller
public class ItemController {
	@Resource
	private ItemService is;
	
	//商品页面
	@RequestMapping(value="/itemlist.action")
	public ModelAndView itemList() {
		List<Items> itemList = is.findAllItems();
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("itemList");
		mav.addObject("itemList", itemList);
		
		return mav;
	}
	
	//跳转到修改页面
	@RequestMapping("itemEdit.action")
	public ModelAndView itemEdit(Integer id) {
		Items item = is.selectItemById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("editItem");
		mav.addObject("item", item);
		return mav;
	}
	
	@RequestMapping("updateitem.action")
	public ModelAndView itemUpdate(Items item) {
		is.itemUpdate(item);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav; 
	}
}
