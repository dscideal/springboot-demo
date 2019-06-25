package ${package.ServiceImpl};

import entity.StockInventory;
import mapper.StockInventoryMapper;
import .IStockInventoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 盘点单主表-验收版 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockInventoryServiceImpl extends ${superServiceImplClass}<StockInventoryMapper, StockInventory> implements IStockInventoryService {

}
