package com.pipisou.pipisou.controller;

import com.pipisou.pipisou.mapper.LinkInfoMapper;
import com.pipisou.pipisou.model.LinkInfo;
import com.pipisou.pipisou.service.LinkInfoQueryService;
import com.pipisou.pipisou.utils.BeanJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api("搜索接口")
@RestController()
@RequestMapping("link")
@Slf4j
public class LinkInfoController {

    @Autowired
    private LinkInfoMapper linkInfoMapper;

    private LinkInfoQueryService linkInfoQueryService;

    @ApiOperation(value = "获取接口", notes = "通过名称获取结果")
    @GetMapping(value = "get", params = {"link_name", "pageNum"})
    public BeanJSONResult getName(@RequestParam String link_name, int pageNum) throws Exception {
        try {
            log.info("Receive new Linkinfo {} ", link_name);
            link_name = "%" + link_name + "%";
            LinkInfo[] linkInfos = linkInfoMapper.findByName(link_name, new RowBounds(pageNum, 20))
                    .toArray(new LinkInfo[] {});
            return BeanJSONResult.ok(linkInfos);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            return BeanJSONResult.errorMsg(e.getMessage());
        }

    }

    @ApiOperation(value = "添加分享接口", notes = "添加分享接口")
    @PostMapping(value = "add" , params = {"link_name", "link_url", "link_passwd"})
    public BeanJSONResult addLink(@RequestParam String link_name, String link_url, String link_passwd) throws Exception {
        try {
            log.info("RequestParam name {} url {} password {}", link_name, link_url, link_passwd);
            LinkInfo linkInfo = new LinkInfo()
                    .withLinkUrl(link_url)
                    .withLinkName(link_name)
                    .withLinkPasswd(link_passwd)
                    .withLinkData(new Date().toString());

            int num = linkInfoMapper.insertOne(linkInfo);
            return BeanJSONResult.ok(num);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            return BeanJSONResult.errorMsg(e.getMessage());
        }
    }

    // public int addOneName(String link_name) {
    //     try {
    //         log.info("addOneName {}", link_name);

    //     } catch (Exception e) {
    //         //TODO: handle exception
    //     }        
    // }

}
