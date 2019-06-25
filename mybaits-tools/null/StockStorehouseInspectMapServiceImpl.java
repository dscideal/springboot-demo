package ${package.ServiceImpl};

import entity.StockStorehouseInspectMap;
import mapper.StockStorehouseInspectMapMapper;
import .IStockStorehouseInspectMapService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 不良品仓与良品仓的映射表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseInspectMapServiceImpl extends ${superServiceImplClass}<StockStorehouseInspectMapMapper, StockStorehouseInspectMap> implements IStockStorehouseInspectMapService {

}
