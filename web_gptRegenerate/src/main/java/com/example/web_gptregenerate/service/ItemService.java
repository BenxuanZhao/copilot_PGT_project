package com.example.web_gptregenerate.service;

import com.example.web_gptregenerate.dao.ItemsMapper;
import com.example.web_gptregenerate.domain.Items;
import com.example.web_gptregenerate.domain.ItemsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
/* Here is the explanation for the code above:
1. We first create the ItemService class and annotate it with @Service, which is a Spring annotation that indicates that this is a service class.

2. We use @Autowired to inject the ItemsMapper object into the ItemService class so that we can use the ItemsMapper object.

3. The findAllItems() method returns the list of all items from the database.

4. The selectItemById() method returns the item with the specified ID.

5. The itemUpdate() method updates the item with the specified ID in the database. */
public class ItemService {
    @Autowired
    private ItemsMapper im ;

    public List<Items> findAllItems(){
        ItemsExample ie = new ItemsExample();
        List<Items> list = im.selectByExampleWithBLOBs(ie);

        return list;
    }
    /* Here is the explanation for the code above:
1. The controller receives the item id from the client.
     */
    public Items selectItemById(Integer id) {
        Items item = im.selectByPrimaryKey(id);
        return item;
    }
    public void itemUpdate(Items item) {
        im.updateByPrimaryKeyWithBLOBs(item);
    }
}

