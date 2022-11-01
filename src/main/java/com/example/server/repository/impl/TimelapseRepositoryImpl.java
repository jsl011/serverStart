package com.example.server.repository.impl;

import com.example.server.entity.TimelapseEntity;
import com.example.server.dao.TimelapseDao;
import com.example.server.repository.TimelapseRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ilang
 * @since 2022-10-22
 */
@Service
public class TimelapseRepositoryImpl extends ServiceImpl<TimelapseDao, TimelapseEntity> implements TimelapseRepository {

}
