package com.ctgu.qmx.student.dao.impl;

import com.ctgu.qmx.common.IBaseDao;
import com.ctgu.qmx.student.entity.StuInfo;

public interface IBaseStuInfoDao extends IBaseDao<String, StuInfo> {

    //根据组名查找，得出数量
    public int classCount(String classId) throws Exception;
}
