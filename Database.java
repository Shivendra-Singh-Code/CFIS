/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHIVA
 */
public class Database {
    
    String username;
    String password;
    String host;
  
	public Database()
		{
        try
        {
            java.io.FileInputStream datain=new java.io.FileInputStream("C:\\Users\\SHIVA\\Desktop\\CFIS\\\\Database1.dat");
            java.io.DataInputStream datadin=new java.io.DataInputStream(datain);
            String line="";
            username=datadin.readLine();
            password=datadin.readLine();
            host=datadin.readLine();
        }catch(Exception e)
        {
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        Database d1=new Database();
        System.out.println(d1.host+" " + d1.password +" " + d1.username);
    }
}
