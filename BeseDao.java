package Dao;

public abstract class BeseDao implements Dao{
   public String IP;//定义IP
   public String name;//定义名称
   public String key;//定义密码
   public int duankouhao;//定义端口号
   public String shujuname;//定义数据名称
   public String shujuqudongname;//定义数据驱动名称
   public  BeseDao(String IP,String name,String key,int duankouhao,String shujuname,String shujuqudongname){
       this.IP = IP;
       this.name = name;
       this.key = key;
       this.duankouhao = duankouhao;
       this.shujuname = shujuname;
       this.shujuqudongname = shujuqudongname;
   }
   public abstract String getUrl();


}
