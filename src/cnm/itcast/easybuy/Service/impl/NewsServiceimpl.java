package cnm.itcast.easybuy.Service.impl;

import cnm.itcast.easybuy.Dao.NewsDao;
import cnm.itcast.easybuy.Dao.impl.NewsDaoimpl;
import cnm.itcast.easybuy.Service.NewsService;
import cnm.itcast.easybuy.pojo.News;
import cnm.itcast.easybuy.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsServiceimpl implements NewsService {
    @Override
    public List<News> getfinAllNews() {

        Connection conn=null;
        List<News> list =new ArrayList<>();

        try {
            conn= DatabaseUtil.getConnection();
            NewsDao dao=new NewsDaoimpl(conn);
           list= dao.getfinAllNews();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}
