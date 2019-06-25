package ${package.ServiceImpl};

import entity.StockStorehouseLocation;
import mapper.StockStorehouseLocationMapper;
import .IStockStorehouseLocationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓位表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseLocationServiceImpl extends ${superServiceImplClass}<StockStorehouseLocationMapper, StockStorehouseLocation> implements IStockStorehouseLocationService {

}
