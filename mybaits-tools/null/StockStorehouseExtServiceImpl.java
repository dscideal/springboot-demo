package ${package.ServiceImpl};

import entity.StockStorehouseExt;
import mapper.StockStorehouseExtMapper;
import .IStockStorehouseExtService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 外部仓库表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseExtServiceImpl extends ${superServiceImplClass}<StockStorehouseExtMapper, StockStorehouseExt> implements IStockStorehouseExtService {

}
