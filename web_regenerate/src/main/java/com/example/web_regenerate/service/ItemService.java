package com.example.web_regenerate.service;

import com.example.web_regenerate.dao.ItemsMapper;
import com.example.web_regenerate.domain.Items;
import com.example.web_regenerate.domain.ItemsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
2. The controller calls the service layer to query the item information according to the item id.
3. The service layer calls the mapper layer to query the item information according to the item id.
4. The mapper layer returns the queried item information to the service layer.
5. The service layer returns the queried item information to the controller.
6. The controller returns the queried item information to the client. */
    public Items selectItemById(Integer id) {
        Items item = im.selectByPrimaryKey(id);
        return item;
    }
    public void itemUpdate(Items item) {
        im.updateByPrimaryKeyWithBLOBs(item);
    }
}
