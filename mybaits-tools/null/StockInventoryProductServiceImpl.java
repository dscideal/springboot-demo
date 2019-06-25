package ${package.ServiceImpl};

import entity.StockInventoryProduct;
import mapper.StockInventoryProductMapper;
import .IStockInventoryProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 盘点单明细表-验收版 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockInventoryProductServiceImpl extends ${superServiceImplClass}<StockInventoryProductMapper, StockInventoryProduct> implements IStockInventoryProductService {

}
