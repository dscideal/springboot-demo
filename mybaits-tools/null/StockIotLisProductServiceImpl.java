package ${package.ServiceImpl};

import entity.StockIotLisProduct;
import mapper.StockIotLisProductMapper;
import .IStockIotLisProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 中移物流的库存数量 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockIotLisProductServiceImpl extends ${superServiceImplClass}<StockIotLisProductMapper, StockIotLisProduct> implements IStockIotLisProductService {

}
