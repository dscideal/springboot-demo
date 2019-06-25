package ${package.ServiceImpl};

import entity.StockPerInSheet;
import mapper.StockPerInSheetMapper;
import .IStockPerInSheetService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 入库单管理 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockPerInSheetServiceImpl extends ${superServiceImplClass}<StockPerInSheetMapper, StockPerInSheet> implements IStockPerInSheetService {

}
