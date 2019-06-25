package ${package.ServiceImpl};

import entity.StockOutProductList;
import mapper.StockOutProductListMapper;
import .IStockOutProductListService;
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
public class StockOutProductListServiceImpl extends ${superServiceImplClass}<StockOutProductListMapper, StockOutProductList> implements IStockOutProductListService {

}
