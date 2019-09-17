package com.xph.service.impl;

import com.xph.bean.Items;
import com.xph.dao.IItemsDao;
import com.xph.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService implements IItemsService {

    @Autowired
    private IItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
