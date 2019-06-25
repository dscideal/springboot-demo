package ${package.ServiceImpl};

import entity.StockOutSheet;
import mapper.StockOutSheetMapper;
import ${package.Service}.IStockOutSheetService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出库单管理 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockOutSheetServiceImpl extends ${superServiceImplClass}<StockOutSheetMapper, StockOutSheet> implements IStockOutSheetService {

}
