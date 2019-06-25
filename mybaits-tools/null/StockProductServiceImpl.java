package ${package.ServiceImpl};

import entity.StockProduct;
import mapper.StockProductMapper;
import .IStockProductService;
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
public class StockProductServiceImpl extends ${superServiceImplClass}<StockProductMapper, StockProduct> implements IStockProductService {

}
