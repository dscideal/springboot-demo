package ${package.ServiceImpl};

import entity.StockProductProxy;
import mapper.StockProductProxyMapper;
import .IStockProductProxyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品暂存库存表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockProductProxyServiceImpl extends ${superServiceImplClass}<StockProductProxyMapper, StockProductProxy> implements IStockProductProxyService {

}
