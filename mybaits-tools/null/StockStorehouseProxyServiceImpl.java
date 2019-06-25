package ${package.ServiceImpl};

import entity.StockStorehouseProxy;
import mapper.StockStorehouseProxyMapper;
import .IStockStorehouseProxyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 暂存仓库表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseProxyServiceImpl extends ${superServiceImplClass}<StockStorehouseProxyMapper, StockStorehouseProxy> implements IStockStorehouseProxyService {

}
