package demo08.data1;

import java.io.FileNotFoundException;

public  class  Demo011{
    public static void main(String[] args) throws FileNotFoundException {
        method(null);

    }
    public  static  void  method(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\a.txt"))
        {
            throw  new FileNotFoundException("传递路径不存在");
        }

    }

}