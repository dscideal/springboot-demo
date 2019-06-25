package ${package.ServiceImpl};

import entity.StockInProductList;
import mapper.StockInProductListMapper;
import .IStockInProductListService;
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
public class StockInProductListServiceImpl extends ${superServiceImplClass}<StockInProductListMapper, StockInProductList> implements IStockInProductListService {

}
