package dao;

import model.Assets;

import java.util.Date;

/**
 * Created by 3 on 3/29/2014.
 */
public class TestAssetsDao {
    public static void main(String[] args) {

        AssetsDao assetsDao = new AssetsDao();
        //TestAssetsDao
        Assets assets = new Assets();
        assets.setName("MayTinh");
        assets.setPrice(10.5);
        //assets.setPurchaseDate();
        assetsDao.addAssets(assets);

        //TestExistDao
       // assetsDao.existAssets("May");
    }
}
