package ${package.ServiceImpl};

import entity.StockAllotProductList;
import mapper.StockAllotProductListMapper;
import .IStockAllotProductListService;
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
public class StockAllotProductListServiceImpl extends ${superServiceImplClass}<StockAllotProductListMapper, StockAllotProductList> implements IStockAllotProductListService {

}
