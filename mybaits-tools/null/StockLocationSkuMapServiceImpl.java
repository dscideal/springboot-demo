package ${package.ServiceImpl};

import entity.StockLocationSkuMap;
import mapper.StockLocationSkuMapMapper;
import .IStockLocationSkuMapService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库商品表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockLocationSkuMapServiceImpl extends ${superServiceImplClass}<StockLocationSkuMapMapper, StockLocationSkuMap> implements IStockLocationSkuMapService {

}
