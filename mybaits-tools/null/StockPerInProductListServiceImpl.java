package ${package.ServiceImpl};

import entity.StockPerInProductList;
import mapper.StockPerInProductListMapper;
import .IStockPerInProductListService;
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
public class StockPerInProductListServiceImpl extends ${superServiceImplClass}<StockPerInProductListMapper, StockPerInProductList> implements IStockPerInProductListService {

}
