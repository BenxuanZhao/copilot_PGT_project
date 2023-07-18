package com.example.web_regenerate.controller;

import com.example.web_regenerate.domain.Items;
import com.example.web_regenerate.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService is;
    @RequestMapping(value="/itemlist.action")
    public ModelAndView itemList() {
        List<Items> itemList = is.findAllItems();


        ModelAndView mav = new ModelAndView();
        mav.setViewName("itemList");
        mav.addObject("itemList", itemList);

        return mav;
    }
    /* Here is the explanation for the code above:
1. @Controller is an annotation that marks a class as a Spring Web MVC controller.
2. @RequestMapping("/itemEdit.action") is an annotation that maps web requests onto specific handler classes and/or handler methods.
3. ModelAndView is a holder for both Model and View in the web MVC framework.
4. The ModelAndView object can be used to pass all the required data to the view.
5. ModelAndView.setViewName("editItem") sets the view name to be resolved with the help of the configured ViewResolver.
6. ModelAndView.addObject("item", item) adds the given object to the model.
7. ModelAndView.addObject("item", item) adds the given object to the model.
8. return mav; returns the view name to be resolved with the help of the configured ViewResolver. */
    @RequestMapping(value="/itemEdit.action")
    public ModelAndView itemEdit(Integer id) {
        Items item = is.selectItemById(id);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("editItem");
        mav.addObject("item", item);

        return mav;
    }
/* Here is the explanation for the code above:
1. @RequestMapping annotation is used to map the request URL to the method. It tells the DispatcherServlet that the request URL /updateitem.action should be mapped to the itemUpdate method.
2.	@ModelAttribute annotation is used to bind the request parameters to the bean properties. In the above example, the itemUpdate method expects an object of type Items as a parameter, so the DispatcherServlet will bind the request parameters to the corresponding properties of the Items object. It uses the name attribute to match the request parameters to the bean properties. As the request parameters have the same names as the bean properties, they will be mapped automatically.
3.	After the method executes, the DispatcherServlet will bind the return value to the model and view. In the above example, the DispatcherServlet will bind the return value of the itemUpdate method to the model and view. The return value is a ModelAndView object, and the view name is success. So the DispatcherServlet will use the success.jsp as the view page.
4.	By default, the DispatcherServlet will look for the view page under /WEB-INF/jsp/. So the success.jsp file should be placed under the /WEB-INF/jsp/ folder.
5.	The DispatcherServlet will forward the request to the success.jsp. */
    @RequestMapping(value="/updateitem.action")
    public String itemUpdate(Items item) {
        is.itemUpdate(item);
        return "success";
    }

}
