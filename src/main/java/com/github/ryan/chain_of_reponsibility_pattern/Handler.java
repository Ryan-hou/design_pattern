package com.github.ryan.chain_of_reponsibility_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: Handler
 * @date March 17,2017
 */
abstract class Handler {
    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected abstract String handleFeeRequest(String user, double fee);
}
