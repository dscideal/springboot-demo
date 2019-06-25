package ${package.ServiceImpl};

import entity.StockPerOutSheet;
import mapper.StockPerOutSheetMapper;
import .IStockPerOutSheetService;
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
public class StockPerOutSheetServiceImpl extends ${superServiceImplClass}<StockPerOutSheetMapper, StockPerOutSheet> implements IStockPerOutSheetService {

}
