package cnm.itcast.easybuy.Dao;

import cnm.itcast.easybuy.pojo.News;

import java.sql.SQLException;
import java.util.List;

public interface NewsDao {

    List<News> getfinAllNews() throws SQLException;
}
