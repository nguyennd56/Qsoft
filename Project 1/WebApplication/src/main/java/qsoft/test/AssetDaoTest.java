package qsoft.test;

import qsoft.dao.AssetsDao;
import qsoft.model.Assets;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Nguyen D. Ngo on 3/29/14.
 */
public class AssetDaoTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(123456);
        Assets a = new Assets("assetName", "price", date);

        /*
        *Test selectQuery
         */
        /*
        *Test insertQuery
         */
        if(AssetsDao.insertQuery(a)){
            ArrayList<Assets> list = AssetsDao.selectQuery();
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i).getName() + " " + list.get(i).getPrice()+ " "+ list.get(i).getPurchaseDate().toString());
            }
        }

        /*
        *
         */

    }
}
