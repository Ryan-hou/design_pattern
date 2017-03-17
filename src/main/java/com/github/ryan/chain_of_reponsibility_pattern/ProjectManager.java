package com.github.ryan.chain_of_reponsibility_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: ProjectManager
 * @date March 17,2017
 */
class ProjectManager extends Handler {
    @Override
    protected String handleFeeRequest(String user, double fee) {
        String result = null;
        // 项目经理的审批权限在 500 以内
        if (fee < 500) {
            if ("张三".equals(user)) {
                result = "成功: 项目经理同意[" + user + "]的报销费用,金额为" + fee + "元";
            } else {
                result = "失败: 项目经理不同意[" + user + "]的报销费用,金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return result;
    }
}
