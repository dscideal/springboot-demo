package ${package.ServiceImpl};

import entity.StockPerOutProductList;
import mapper.StockPerOutProductListMapper;
import .IStockPerOutProductListService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockPerOutProductListServiceImpl extends ${superServiceImplClass}<StockPerOutProductListMapper, StockPerOutProductList> implements IStockPerOutProductListService {

}
