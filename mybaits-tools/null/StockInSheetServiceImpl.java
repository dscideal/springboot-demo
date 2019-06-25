package ${package.ServiceImpl};

import entity.StockInSheet;
import mapper.StockInSheetMapper;
import .IStockInSheetService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 入库管理 服务实现类
 * </p>
 *
 * @author yanggw
 * @since 2018-06-17
 */
@Service
public class StockInSheetServiceImpl extends ${superServiceImplClass}<StockInSheetMapper, StockInSheet> implements IStockInSheetService {

}
