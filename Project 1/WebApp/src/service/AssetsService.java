package service;

import dao.AssetsDao;
import model.Assets;

/**
 * Created by 3 on 3/29/2014.
 */
public class AssetsService {
    public AssetsDao assetsDao = new AssetsDao();
    Assets assets = new Assets();

    public boolean addAssets(String name,Double price) {
        assets.setName(name);
        assets.setPrice(price);
        if (assetsDao.existAssets(assets.getName())) {
            return false;
        } else {
            assetsDao.addAssets(assets);
            return true;
        }
    }

    public boolean removeAssets(String name){
        if (assetsDao.existAssets(name)){
            assetsDao.removeAssets(name);
            return true;
        }
        else{
            return false;
        }
    }

    public int getId(String name){
        return assetsDao.getId(name);
    }

    public String getName(int id){
        return assetsDao.getName(id);
    }
}
