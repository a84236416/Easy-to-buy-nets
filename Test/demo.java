import cnm.itcast.easybuy.Service.NewsService;
import cnm.itcast.easybuy.Service.impl.NewsServiceimpl;
import cnm.itcast.easybuy.pojo.News;
import org.junit.Test;

import java.util.List;

public class demo {


    @Test
    public  void f1(){

        NewsService newsService=new NewsServiceimpl();
       List<News> list= newsService.getfinAllNews();

        for (News n:list) {
            System.out.println(n);
        }

    };

}
