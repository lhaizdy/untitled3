package Dao;

public class OracleDao extends BeseDao {
    public OracleDao(String IP, String name, String key, int duankouhao, String shujuname, String shujuqudongname) {
        super(IP, name, key, duankouhao, shujuname, shujuqudongname);
    }

    public String getUrl() {
        return "jdbc:mysql:thin：@//"+ IP + ":" + duankouhao + "/" + shujuname;

    }

    @Override
    public boolean openConnection() {
        System.out.println("OracleDao 创建数据库连接");
        return true;
    }


    @Override
    public boolean closeConnection() {
        System.out.println("OracleDao 关闭数据库连接");
        return true;
    }

    @Override
    public boolean add() {
        System.out.println("OracleDao 添加了一条数据");
        return true;
    }

    @Override
    public boolean delete() {
        System.out.println("OracleDao 删除了一条数据");
        return true;
    }

    @Override
    public boolean update() {
        System.out.println("OracleDao 修改了一条数据");
        return true;
    }

    @Override
    public Object find() {
        System.out.println("OracleDao 查找了一条数据");
        return new Object();
    }
}