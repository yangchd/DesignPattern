package com.yangchd.design.creational.builder;

/**
 * @author yangchd  2018/6/21.
 */
public class ActorController {

    /**
     * 逐步构建复杂产品对象
     * @param ab    角色建造
     * @return      角色
     */
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
