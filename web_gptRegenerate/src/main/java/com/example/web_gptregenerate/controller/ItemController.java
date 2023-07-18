package com.example.web_gptregenerate.controller;

import com.example.web_gptregenerate.domain.Items;
import com.example.web_gptregenerate.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping("/itemlist.action")
    public ModelAndView itemList() {
        List<Items> items = itemService.findAllItems();
        ModelAndView mav = new ModelAndView();
        mav.addObject("itemsList", items);
        mav.setViewName("itemlist");
        return mav;
    }

    @RequestMapping("itemEdit.action")
    public ModelAndView itemEdit(Integer id) {
        // Retrieving item based on id
        Items item = itemService.selectItemById(id);

        ModelAndView mav = new ModelAndView();
        // Setting view name to "editItem"
        mav.setViewName("editItem");
        // Adding retrieved item object to the ModelAndView
        mav.addObject("item", item);

        // Returning ModelAndView object
        return mav;
    }

    @RequestMapping("updateitem.action")
    public ModelAndView itemUpdate(@ModelAttribute Items item) {
        // Updating item in the database
        itemService.itemUpdate(item);

        ModelAndView mav = new ModelAndView();
        // Setting view name to "success"
        mav.setViewName("success");

        // Returning ModelAndView object
        return mav;
    }
}
