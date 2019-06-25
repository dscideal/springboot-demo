package ${package.ServiceImpl};

import entity.StockStorehouseLink;
import mapper.StockStorehouseLinkMapper;
import .IStockStorehouseLinkService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库联系人表 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockStorehouseLinkServiceImpl extends ${superServiceImplClass}<StockStorehouseLinkMapper, StockStorehouseLink> implements IStockStorehouseLinkService {

}
