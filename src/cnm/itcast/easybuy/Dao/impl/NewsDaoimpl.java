package cnm.itcast.easybuy.Dao.impl;

import cnm.itcast.easybuy.Dao.NewsDao;
import cnm.itcast.easybuy.pojo.News;
import cnm.itcast.easybuy.util.BaseDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoimpl extends BaseDao implements NewsDao {
    public NewsDaoimpl(Connection conn) {
        super(conn);
    }

    @Override
    public List<News> getfinAllNews() throws SQLException {

        String sql="SELECT * FROM easybuy_news";
         List<News> list=new ArrayList<>();
        ResultSet rs=super.executeQuery(sql);

        while (rs.next()){
            News news=new News();
            news.setId(rs.getInt("id"));
           news.setTitle(rs.getString("title"));
           news.setContebt(rs.getString("content"));
           news.setCreateTime(rs.getString("createTime"));
           list.add(news);
        }

        return list;
    }
}
