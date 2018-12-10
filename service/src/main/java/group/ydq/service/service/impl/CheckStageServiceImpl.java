package group.ydq.service.service.impl;

import group.ydq.model.dao.cs.CheckStageRepository;
import group.ydq.model.entity.cs.CheckStage;
import group.ydq.service.service.CheckStageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author:Leo
 * date:2018/11/29
 */
@Service
public class CheckStageServiceImpl implements CheckStageService {
    @Resource
    private CheckStageRepository stageDao;

    @Override
    public void save(CheckStage s) {
        stageDao.save(s);
    }

    @Override
    public List<CheckStage> findAll() {
        return stageDao.findAll();
    }
}