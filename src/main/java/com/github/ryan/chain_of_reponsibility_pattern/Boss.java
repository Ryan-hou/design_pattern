package com.github.ryan.chain_of_reponsibility_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Boss
 * @date March 17,2017
 */
class Boss extends Handler {
    @Override
    protected String handleFeeRequest(String user, double fee) {
        String result = null;
        if (fee >= 1000) {
            if ("张三".equals(user)) {
                result = "成功: Boss同意[" + user + "]的报销费用,金额为" + fee + "元";
            } else {
                result = "失败: Boss不同意[" + user + "]的报销费用,金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return result;
    }
}
