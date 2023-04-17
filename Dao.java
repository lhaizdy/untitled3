package Dao;

public interface Dao {

    boolean openConnection(); //创建连接
    boolean closeConnection();//关闭连接
    boolean add();//添加
    boolean delete();//删除
    boolean update();//更改
    Object find();//查找

}
