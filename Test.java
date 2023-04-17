package Dao;


public class Test {
    public static void main(String[] args) {
        Dao dao = new MySQLDao("192.168.0.1","Room","219980817",66,"潇洒哥1号数据库","wzry");
        Dao dao2 = new OracleDao("192.168.0.0","Room","lh219980817",66,"潇洒哥2号数据库","yxlm");
        dao.openConnection();
        dao.closeConnection();
        dao.add();
        dao.delete();
        dao.update();
        dao.find();
        System.out.println("*********************");
        dao2.openConnection();
        dao2.add();
        dao2.delete();
        dao2.update();
        dao2.find();
        dao2.closeConnection();

    }
}
