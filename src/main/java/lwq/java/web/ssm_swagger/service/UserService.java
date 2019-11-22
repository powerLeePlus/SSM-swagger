package lwq.java.web.ssm_swagger.service;

import lwq.java.web.ssm_swagger.entity.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author lwq
 * @date 2019/6/28 0028
 */
public interface UserService {
    public List list();

    void save(User user);
}
