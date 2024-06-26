package zwz.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import zwz.utils.PageUtils;
import zwz.entity.TuihuantushuEntity;
import java.util.List;
import java.util.Map;
import zwz.entity.vo.TuihuantushuVO;
import org.apache.ibatis.annotations.Param;
import zwz.entity.view.TuihuantushuView;


/**
 * 退换图书
 *
 * @author 
 * @email 
 * @date 2021-03-05 14:09:24
 */
public interface TuihuantushuService extends IService<TuihuantushuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuantushuVO> selectListVO(Wrapper<TuihuantushuEntity> wrapper);
   	
   	TuihuantushuVO selectVO(@Param("ew") Wrapper<TuihuantushuEntity> wrapper);
   	
   	List<TuihuantushuView> selectListView(Wrapper<TuihuantushuEntity> wrapper);
   	
   	TuihuantushuView selectView(@Param("ew") Wrapper<TuihuantushuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuantushuEntity> wrapper);
   	
}

