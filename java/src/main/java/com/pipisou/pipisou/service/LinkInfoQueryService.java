package com.pipisou.pipisou.service;


import com.pipisou.pipisou.mapper.LinkInfoMapper;
import com.pipisou.pipisou.mapper.QueryNumsMapper;
import com.pipisou.pipisou.model.LinkInfo;
import com.pipisou.pipisou.utils.BeanJSONResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@CacheConfig(cacheNames = "LinkInfoCache")
public class LinkInfoQueryService {

    @Autowired
    private LinkInfoMapper linkInfoMapper;

    @Autowired
    private QueryNumsMapper QueryNumsMapper;


    public LinkInfo[] getName(String link_name, int pageNum) throws Exception {
        try {
            log.info("getName this Name {} ", link_name);
            link_name = "%" + link_name + "%";
            LinkInfo[] linkInfos = linkInfoMapper.findByName(link_name, new RowBounds(pageNum, 20))
                    .toArray(new LinkInfo[] {});
            return linkInfos;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
