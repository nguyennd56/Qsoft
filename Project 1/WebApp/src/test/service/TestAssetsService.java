package test.service;

import dao.AssetsDao;
import service.AssetsService;

/**
 * Created by 3 on 3/30/2014.
 */
public class TestAssetsService {

    public static void main(String[] args) {
        AssetsService assetsService = new AssetsService();
        String name = assetsService.getName(1);
        System.out.println(name);
    }
}
