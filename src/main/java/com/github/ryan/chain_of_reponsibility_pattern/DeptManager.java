package com.github.ryan.chain_of_reponsibility_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: DeptManager
 * @date March 17,2017
 */
class DeptManager extends Handler {
    @Override
    protected String handleFeeRequest(String user, double fee) {
        // 部门经理的审批权限在1000元以内
        String result = null;
        if (fee < 1000) {
            if ("张三".equals(user)) {
                result = "成功: 部门经理同意[" + user + "]的报销费用,金额为" + fee + "元";
            } else {
                result = "失败: 部门经理不同意[" + user + "]的报销费用,金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return result;
    }
}
