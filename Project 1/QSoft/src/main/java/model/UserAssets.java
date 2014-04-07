package model;

/**
 * Created by 3 on 3/29/2014.
 */
public class UserAssets {
    public int id;
    public int userId;
    public int assetsId;
    public int number;

    public UserAssets(){

    }
    public UserAssets(int userId, int assetsId, int number) {
        this.userId = userId;
        this.assetsId = assetsId;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(int assetsId) {
        this.assetsId = assetsId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
