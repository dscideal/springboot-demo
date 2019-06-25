package ${package.ServiceImpl};

import entity.StockStorehouse;
import mapper.StockStorehouseMapper;
import .IStockStorehouseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseServiceImpl extends ${superServiceImplClass}<StockStorehouseMapper, StockStorehouse> implements IStockStorehouseService {

}
