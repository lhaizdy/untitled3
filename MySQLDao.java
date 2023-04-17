package Dao;

public class MySQLDao extends BeseDao {
    public MySQLDao(String IP, String name, String key, int duankouhao, String shujuname, String shujuqudongname) {
        super(IP, name, key, duankouhao, shujuname, shujuqudongname);
    }

    public String getUrl() {
        return "jdbc:mysql://"+ IP + ":" + duankouhao + "/" + shujuname;

    }

    @Override
    public boolean openConnection() {
        System.out.println("MySQLDao 创建数据库连接");
        return true;
    }


    @Override
    public boolean closeConnection() {
        System.out.println("MySQLDao 关闭数据库连接");
        return true;
    }

    @Override
    public boolean add() {
        System.out.println("MySQLDao 添加了一条数据");
        return true;
    }

    @Override
    public boolean delete() {
        System.out.println("MySQLDao 删除了一条数据");
        return true;
    }

    @Override
    public boolean update() {
        System.out.println("MySQLDao 修改了一条数据");
        return true;
    }

    @Override
    public Object find() {
        System.out.println("MySQLDao 查找了一条数据");
        return new Object();
    }
}