package 责任链模式;

import org.apache.commons.lang.StringUtils;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 22:33
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())) {
            System.out.println(course.getVideo() + "含有视频，批准");

            if (approver != null) {
                approver.deploy(course);
            }

        } else {
            System.out.println(course.getName() + "不含有视频，不批准, 流程结束");
            return;
        }
    }
}
