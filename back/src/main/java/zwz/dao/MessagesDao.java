package zwz.dao;

import zwz.entity.MessagesEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import zwz.entity.vo.MessagesVO;
import zwz.entity.view.MessagesView;


/**
 * 留言板
 * 
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
public interface MessagesDao extends BaseMapper<MessagesEntity> {
	
	List<MessagesVO> selectListVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	MessagesVO selectVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	List<MessagesView> selectListView(@Param("ew") Wrapper<MessagesEntity> wrapper);

	List<MessagesView> selectListView(Pagination page,@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	MessagesView selectView(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
}